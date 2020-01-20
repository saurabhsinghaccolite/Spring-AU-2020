package annonation;

@classanno(cval=20)
public class classannocall {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Class cls=classannocall.class;
		System.out.println("Class annotation  "+cls.getAnnotation(classanno.class));

	}

}
