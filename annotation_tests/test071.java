import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

public class test071 {

    @Target(ElementType.FIELD) @interface Marker {}
    
    @Marker static int i = 123;
}