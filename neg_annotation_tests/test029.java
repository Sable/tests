import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnn {
  String value() default "Default Message";
}

@MyAnn
public class test029 {
	public @MyAnn void something() { }	
}
