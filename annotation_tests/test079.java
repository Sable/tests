public class test079 {
  @TestAnnotation(testAttribute = "test") class A {
  }
  public static void main(String[] args) {
    System.out.print(A.class.isAnnotationPresent(TestAnnotation.class));
  }
}