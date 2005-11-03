import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

public class test040 {

    @Target(ElementType.TYPE) @interface Marker {}
    
    @Marker static int i = 123;
}