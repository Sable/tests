public class test200 extends Y {
	<T> java.util.List<T> foo3(java.util.List<T> t) { return t; }
	Class<String> foo4() { return null; }
	Class<String>[] foo5() { return null; }
}
class Y {
	<T> java.util.List<T> foo3(java.util.List<T> t) { return t; }
	Class<? extends String> foo4() { return null; }
	Class<? extends String>[] foo5() { return null; }
}
