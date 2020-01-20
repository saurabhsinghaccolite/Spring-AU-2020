package lamda;

public class exceptionlamda {

	static void func(int a, int b, int c , trilamda<Integer,Integer,Integer> tri)
	{
		tri.accept(a, b, c);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		func(10,20,0,(a,b,c)-> {
			try
			{
				System.out.println((a+b)/c);
			}
			catch(Exception e)
			{
				System.out.print(e.getMessage());
			}
		});
		

	}

}
