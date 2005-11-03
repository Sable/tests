enum Color {	BLUE, RED, GREEN
}
@interface I {
    Color[] value() default { Color.GREEN };
}

public class test048 {
    @I(Color.RED) void foo() {
    }
}
