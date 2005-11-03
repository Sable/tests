public class test290<T> {
class MX<U> {
}
 
public static void main(String[] args) {
    new test290<Thread>().foo(new test290<String>().new MX<Thread>());
}
void foo(test290.MX mx) {
   System.out.println("SUCCESS");
}
}
