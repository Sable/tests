public class test203 extends Y implements I { public <T> void foo(Class<T> s) {} }
interface I { <T, S> void foo(Class<T> s); }
class Y { public <T> void foo(Class<T> s) {} }
