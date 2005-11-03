interface AA<W, Z extends AA<W, Z>> { 
 public boolean m(AA<W, ?> that); 
 public Z z(); 
 public boolean b(); 
}
abstract class test197<U, V extends AA<U, V>> implements AA<U,V> { 
 public boolean m(AA<U, ?> wht) { return wht.z().b(); } 
}
