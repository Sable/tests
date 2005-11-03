@interface I {
    long value() default 6;
}

public class test043 {
    @I(Long.MAX_VALUE) void foo() {
    }
}
