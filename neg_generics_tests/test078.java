public class test078 <T extends test078A> { 
    public static void main(String[] args) {
        foo(new test078<test078A>());
        System.out.println("SUCCESS");
    }
    static void foo(test078<? super String> zs) {
    }
}

class test078A {
    void foo() {}
}

class test078B extends test078A {
}