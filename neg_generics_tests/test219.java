import java.util.List;

public class test219 {

public void write(List<? super Exception> list) {
	
  list.add(new RuntimeException());             // works
  list.add(new IllegalMonitorStateException()); // works
  Exception exc = new Exception();
  list.add(exc);                                // works
  list.add(new Object());                       // should fail
  list.add(new Throwable());                    // should fail
  list.add(new Exception());                    // works
}
}