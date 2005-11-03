public abstract class test202 extends Y implements I {}
interface I { void foo(Class<String> s); }
class Y { void foo(Class<? extends String> s) {} }
