@interface I {
    short value() default 0;
}

public class test041 {
    @I(2) void foo() {
    }
}
