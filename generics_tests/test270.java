public class test270 { 
    public static void main(String argv[]) {
		
		new test270().new M<Exception>(null) {
			void run() {
				Exception e = ex;
				System.out.println("SUCCESS");
			}
		}.run();
    }
    class M<E extends Throwable> {
        E ex;
        M(E ex) {
            this.ex = ex;
        }
    }
}
