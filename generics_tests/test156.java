import java.util.ArrayList;
import java.util.List;
class TestElement extends ArrayList implements Runnable {
  public void run() {
  }
}
public class test156 <E extends List & Runnable> {
  public test156(E element) {
    element.run();
  }
  public static void main(String[] args) {
    new test156<TestElement>(new TestElement());
    System.out.println("SUCCESS");
  }
}
