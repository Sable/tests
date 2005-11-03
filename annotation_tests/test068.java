import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

@Target(TYPE)
@interface Annot {
}

@Annot
public @interface test068 {
}
