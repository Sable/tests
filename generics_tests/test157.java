import java.util.ArrayList;
import java.util.List;
class TestElement extends ArrayList implements Runnable {
  static final long serialVersionUID = 1l;
  public void run() {
  	// empty
  }
}
public class test157 <E extends List & Runnable> {
	E element;
  public test157(E element) {
  	this.element = element;
    element.run();
  }
  public test157(test157<?> x) {
    x.element.run();
  }
  public static void main(String[] args) {
    new test157<TestElement>(new TestElement());
    System.out.println("SUCCESS");
  }
}
