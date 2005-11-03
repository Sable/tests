import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;

@Retention(SOURCE)
@Target({TYPE})
@interface test061 {
  public int tst() default -1;
}