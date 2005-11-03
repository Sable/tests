public class test053 <T> {
    public static void main(String[] args) {
		new test053<String>().foo(args);
	}
    
    void foo(T[] ts) {
        System.out.println("SUCCESS");
    }
}
