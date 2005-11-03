import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

public class test067 {

  @Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE) @interface
TestAnnotation {

    String testAttribute();

  }
  @TestAnnotation(testAttribute = "test") class A {
  }

  public static void main(String[] args) {
    System.out.print(A.class.isAnnotationPresent(TestAnnotation.class));
  }

}