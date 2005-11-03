public class test200 extends Y {
	void foo(Class<String> s) {}
}
class Y {
	void foo(Class<? extends String> s) {}
}
