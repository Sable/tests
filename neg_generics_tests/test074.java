public class test074 { 
    public static void main(String[] args) {
		test074 x = new test074();
		Class c1 = x.getClass();
		Class<? extends test074> c2 = x.getClass();
		String s = "hello";
		Class<? extends test074> c3 = s.getClass();
		System.out.println("SUCCESS");
    }
}
