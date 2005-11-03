import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

public class test069 {

    @Target(ElementType.PARAMETER) @interface I {}
    
    void m(@I int i){
    }
}