public class test054 <T> {
    public static void main(String[] args) {
		new test054<String>().foo(args, new test054<test054<String>>());
		new test054<String>().foo(args, new test054<test054<Integer>>());
	}
    <U> void foo(U[] us, test054<test054<U>> xxu) {
        System.out.println("SUCCESS");
    }
}
