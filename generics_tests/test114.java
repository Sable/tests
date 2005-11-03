public class test114 {
    public test114 foo() {
        System.out.println("Did NOT add bridge method");
        return this;
    }
    public static void main(String[] args) throws Exception {
        test114 x = new A();
        x.foo();
        System.out.print(" + ");
        I i = new A();
        i.foo();
    }
}
interface I {
    public I foo();
}
class A extends test114 implements I {
    public A foo() {
        System.out.print("Added bridge method");
        return this;
    }
}
