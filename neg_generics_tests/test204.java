public class test204 extends Y implements I {}
interface I { <T, S> void foo(Class<T> s); }
class Y { public <T> void foo(Class<T> s) {} }
