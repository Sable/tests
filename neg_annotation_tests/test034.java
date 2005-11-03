import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

@Target ({FIELD, FIELD})
@interface Tgt {
	E[] foo();
	int[] bar();
}
enum E {
	BLEU, BLANC, ROUGE
}

@Tgt( foo = { E.BLEU, E.BLEU}, bar = { 0, 0} )
public class test034 {
}
