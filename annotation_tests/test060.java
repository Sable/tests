import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;

@Retention(SOURCE)
@Target({TYPE})
@interface Attr {
  public int tst() default -1;
}

@Attr 
public class test060 {
  public static void main(String args[]) {
  	Object e = test060.class.getAnnotation(Attr.class);
  	System.out.print(e);
  }
}