@interface I {
    short value() default 0;
}

public class test053 {
    @I(2) void foo() {
    }
}

