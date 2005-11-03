public class test034<T> {
    T q;
     public static void main(String[] args) {
         test034<String[]> xss = new test034<String[]>();
         test034<test034<String[]>> xxs = new test034<test034<String[]>>();
         xxs.q = xss;
         System.out.println("SUCCESS");
     }
}
