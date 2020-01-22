package sample;

public class product
{
	private int id;
	private String name;
	private int qty;
	private double rate;
	
	product(int i,String n,int q,double r)
	{
		id=i;
		name=n;
		qty=q;
		rate=r;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
//	public static void main(String[] args)
//	{
//		// TODO Auto-generated method stub
//		
//
//	}

}
