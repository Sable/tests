public class test058 { 

    public static void main(String[] args) {
		test058[] x = new test058[0];
		Class<? extends test058[]> c = x.getClass();
		System.out.println("SUCCESS");
    }
}
