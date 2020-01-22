package sample;

public class cart 
{
	int id[];
	String name[];
	int qty[];
	double rate[];
	double total;
	
	
	cart(product arr[])
	{
		id=new int[4];
		name=new String[4];
		qty=new int[4];
		rate=new double[4];
		for(int i=0;i<4;i++)
		{
			id[i]=arr[i].getId();
			name[i]=arr[i].getName();
			qty[i]=0;
			rate[i]=arr[i].getRate();
		}
		//System.out.println("out of const");
	}
	
	void display()
	{
		int flag=0;
		
		for(int i=0;i<4;i++)
		{
			if(qty[i]>0)
			{
				flag=1;
				System.out.println("Your Cart");
				System.out.println("Product id \t\t Product name \t\t Quantity \t\t Cost");
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Cart empty!!");
		}
		//System.out.println("Product id \t\t Product name \t\t Quantity \t\t Cost");
		for(int i=0;i<4;i++)
		{
			if(qty[i]>0)
			System.out.println(id[i]+"\t\t\t"+name[i]+"\t\t"+qty[i]+"\t\t"+qty[i]*rate[i]);
		}
	}
	
	void totalbill()
	{
		for(int i=0;i<4;i++)
		{
			if(qty[i]>0)
			{
				total+=qty[i]*rate[i];
			}
		}
		System.out.println("Total bill:"+total);
	}
	
	void remove(int i)
	{
		if(qty[i-1]==0)
		{
			System.out.println("Item not in cart");
		}
		qty[i-1]=0;
	}
}
