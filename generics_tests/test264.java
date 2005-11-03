class test264A {}
interface test264B {
	test264B CONST = new test264B(){ public String toString() { return "SUCCESS"; }};
}
class test264AB extends test264A implements test264B {}

public class test264 <E extends test264A&test264B> {
	E e;
  public static void main(String[] args) {
	  System.out.print(new test264<test264AB>().e.CONST);
	  new test264<test264AB>().foo();
  }
  public void foo() {
    System.out.print(this.e.CONST);
  }
}
