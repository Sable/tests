public class test040 {
	static Integer foo1() {
		return 0;
	}
	static int foo2() {
		return new Integer(0);
	}
	public static void main(String[] args) {
		System.out.print(foo1());
		System.out.println(foo2());
	}
}
