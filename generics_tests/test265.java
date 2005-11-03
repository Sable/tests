class test265A {}
interface test265B {
	test265B CONST = new test265B(){ public String toString() { return "SUCCESS"; }};
}
class test265AB extends test265A implements test265B {}

public class test265 <E extends test265A&test265B> {
  E e() { return null; }
  public static void main(String[] args) {
	  System.out.print(new test265<test265AB>().e().CONST);
	  new test265<test265AB>().foo();
  }
  public void foo() {
    System.out.print(this.e().CONST);
  }
}
