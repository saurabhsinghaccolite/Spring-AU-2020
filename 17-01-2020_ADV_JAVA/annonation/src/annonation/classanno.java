package annonation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  //HELPS TO FETCH THE VALUUE AT RUNTIME
@Target(ElementType.TYPE) 
public @interface classanno
{
	int cval() default 2;
}

