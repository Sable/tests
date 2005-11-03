@interface I {
    int value() default 0;
}

public class test039 {
    @I(2) void foo() {
    }
}
