@interface I {
    short[] value() default { 2 };
}

public class test055 {
    @I(2) void foo() {
    }
}
