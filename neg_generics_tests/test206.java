public class test206 extends Y {
	Class<? extends String> foo() { return null; }
	Class<? extends String>[] foo2() { return null; }
}
class Y {
	Class<String> foo() { return null; }
	Class<String>[] foo2() { return null; }
}
