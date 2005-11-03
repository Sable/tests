public abstract class test205 extends Y implements I {}
interface I { <T> void foo(Class<T> s); }
class Y { public <T, S> void foo(Class<T> s) {} }
