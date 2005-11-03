@interface I {
    short[] value() default 2;
}

public class test054 {
    @I(2) void foo() {
    }
}
