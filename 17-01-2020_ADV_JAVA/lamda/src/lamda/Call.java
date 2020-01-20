package lamda;

public class Call 
{
	
	static void max(int a, int b, int c , trilamda<Integer,Integer,Integer> tri)
	{
		tri.accept(a, b, c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		max(5,10,15,(a,b,c) -> {
			int m=Math.max(a, b);
			m=Math.max(m,c);
			System.out.println(m);
		});

	}

}
