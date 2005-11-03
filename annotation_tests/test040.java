@interface I {
    byte value() default 0;
}

public class test040 {
    @I(2) void foo() {
    }
}
