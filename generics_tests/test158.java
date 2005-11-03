import java.util.*;
public class test158<A> {

  A v2;
  test158(A a) { v2 = a; }
  
  void func() {
    List<B<A>> l = new ArrayList<B<A>>();
  }

  class B<T> {
    T v1;
    B(T b) {  v1 = b; }
  }
  
}
