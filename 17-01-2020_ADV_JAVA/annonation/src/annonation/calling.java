package annonation;

import java.lang.reflect.Method;

public class calling {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		call c=new call();
		Method m=c.getClass().getMethod("getdefaultvalue");
		methodanno mobj=m.getAnnotation(methodanno.class);
		System.out.println("calling annotation with default value assigned "+mobj.val());
		
		m=c.getClass().getMethod("getassignedvalue");
		mobj=m.getAnnotation(methodanno.class);
		System.out.println("calling annotation with assigned value assigned "+mobj.val());
		
	}

}
