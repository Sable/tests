public class test275 { 
    public static void main(String argv[]) {
		
		new test275().new M(null) {
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
