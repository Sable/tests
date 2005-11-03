import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;

@Retention(CLASS)
@Target({TYPE})
@interface test063 {
  public int tst() default -1;
}