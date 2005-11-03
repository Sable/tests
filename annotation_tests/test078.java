import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE) public @interface
test078 {
    String testAttribute();
}
