 import java.util.*;
 public class test130 {
  List list() { return null; }
  void m() { List<test130> l = (List<test130>)list(); } // unsafe cast
  void m0() { List<test130> l = list(); } // unsafe conversion
  void m1() { for (test130 a : list()); } // type mismatch
  void m2() { for (Iterator<test130> i = list().iterator(); i.hasNext();); }  // unsafe conversion
  void m3() { Collection c = null; List l = (List<test130>)c; } // unsafe cast
  void m4() { Collection c = null; List l = (List<?>)c; } // ok
  void m5() { List c = null; List l = (Collection<test130>)c; } // type mismatch
  void m6() { List c = null; List l = (Collection<?>)c; } // type mismatch
}
