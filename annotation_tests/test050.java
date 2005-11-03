@interface Foo {
    double value() default 0.0;
    int id() default 0;
}
enum Color {	BLUE, RED, GREEN
}
@interface I {
    Color enums() default Color.GREEN;
    Foo annotations() default @Foo();
    int ints() default 0;
    byte bytes() default 0;
    short shorts() default 0;
    long longs() default Long.MIN_VALUE;
    String strings() default "";
    boolean booleans() default true;
    float floats() default Float.MAX_VALUE;
    double doubles() default Double.MAX_VALUE;
}

public class test050 {
    @I(enums=Color.RED,
		annotations=@Foo(),
		ints=2,
		bytes=1,
		shorts=5,
		longs=Long.MIN_VALUE,
		strings="Hi",
		booleans=true,
		floats=0.0f,
		doubles=-0.0) void foo() {
    }
}
