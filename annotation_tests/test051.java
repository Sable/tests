@interface I {
    String[] names();
}

public class test051 {
    @I(names={"Hello"}) void foo() {
    }
}
