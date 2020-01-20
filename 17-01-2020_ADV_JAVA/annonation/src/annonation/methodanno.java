package annonation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  //HELPS TO FETCH THE VALUUE AT RUNTIME
@Target(ElementType.METHOD) 
public @interface methodanno
{
	int val() default 1;
}




class call
{
	@methodanno
	public void getdefaultvalue()
	{
		System.out.println("default");
	}
	
	@methodanno(val=10)
	public void getassignedvalue()
	{
		System.out.println("assigned");
	}
}