import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

public class test070 {

    @Target(ElementType.TYPE) @interface Annot1 {}
    
    @Annot1 @interface Annot2 {}
}