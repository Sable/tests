@interface Foo {
    double value() default 0.0;
    int id();
}
@interface I {
    Foo value();
}

public class test046 {
    @I(@Foo(id=5)) void foo() {
    }
}
