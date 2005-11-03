public class test160<T> implements I<T> {
    public I.A foo() {
        return a;
    }
}    
interface I<T> {
    A a = new A();
    class A {
    }
}

class test160M<T> {
    A a = new A();
    class A {
    }
}	

class test160MSub<T> extends test160M<T> {
    public test160M.A foo() {
        return a;
    }
}    

