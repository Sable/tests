public class test079 <T extends test079B> { 
    public static void main(String[] args) {
        foo(new test079<test079B>());
    }
    static void foo(test079<? super test079A> zs) {
        zs.foo();
    }
}
class test079A {
}
class test079B extends test079A {
    void foo() {}
}