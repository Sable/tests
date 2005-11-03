public class test014 {
    public static void main(String[] args) {
        a(new Integer(1), 2);
    }
    public static void a(int a, int b) { System.out.println("SUCCESS"); }
    public static void a(Object a, Object b) {}
}
