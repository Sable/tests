class test266A {}
interface test266B {
	test266B CONST = new test266B(){ public String toString() { return "SUCCESS"; }};
}
class test266AB extends test266A implements test266B {}

public class test266 <E extends test266A&test266B> {
  E e;
  public static void main(String[] args) {
	  new test266<test266AB>().foo();
  }
  public void foo() {
	new Object() {
		void run() {
			System.out.print(e.CONST);
		}
	}.run();
    System.out.print(e.CONST);
  }
}
