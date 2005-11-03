public class test289<T> {
class MX<U> {
}
 
public static void main(String[] args) {
    new test289<Thread>().foo(new test289<String>().new MX<Thread>());
}
void foo(test289<String>.MX<Thread> mx) {
   System.out.println("SUCCESS");
}
}
