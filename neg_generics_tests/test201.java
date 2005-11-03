public class test201 extends Y implements I {}
interface I { void foo(Class<? extends String> s); }
class Y { void foo(Class<String> s) {} }
