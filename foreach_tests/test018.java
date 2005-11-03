public class test018 {
    Object[] array = {
    };
    void test() {
        for (Object object : array) {
            String str = object.toString();
            str += "";
        }
    }
    public static void main(String[] args) {
        new test018().test();
		System.out.println("SUCCESS");
    }
}
