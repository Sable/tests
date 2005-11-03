@interface I {
    boolean[] val() default {true};
}

public class test036 {
    @I(val = false) void foo() {
    }
}
