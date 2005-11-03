public class test059<T> {
    public static void main(String[] args) {
        test059 x = new Y();
        System.out.println(x.foo());
    }
   T foo() {return null;}
   void foo(T t) {}
}
class Y extends test059<Object> {
    String foo() {return "SUCCESS";}
    void foo(String s) {}
}
