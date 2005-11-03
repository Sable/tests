@interface I {
    int value() default 0L;
}

public class test030 {
    @I(2) void foo() {
    }
}

