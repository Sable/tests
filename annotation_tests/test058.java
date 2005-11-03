import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;

@Retention(RUNTIME)
@Target({TYPE})
@interface Attr {
  public int tst() default -1;
}

@Attr 
public class test058 {
  public static void main(String args[]) {
  	Object e = test058.class.getAnnotation(Attr.class);
  	System.out.print(e);
  }
}