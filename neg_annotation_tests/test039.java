import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

@Target(LOCAL_VARIABLE)
@interface Annot {
}

public class test039 {
	void foo(@Annot int i) {
		@Annot int j;
	}
}
