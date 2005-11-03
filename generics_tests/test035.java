public class test035<T> {
    T q;
    
     public static void main(String[] args) {
         test035<String[]> xss = new test035<String[]>();
         test035<test035<String[]>> xxs = new test035<test035<String[]>>();
         xxs.q = xss;
         System.out.println("SUCCESS");
     }
      void foo(test035[] xs) {
          xs[0] = new test035<String>();
     }
}
