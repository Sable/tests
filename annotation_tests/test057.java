@interface Foo {
    double value() default 0.0;
    int id() default 0;
}
enum Color {	BLUE, RED, GREEN
}
@interface I {
    Color _enum() default Color.GREEN;
    Foo _annotation() default @Foo();
    int _int() default 0;
    byte _byte() default 1;
    short _short() default 3;
    long _long() default Long.MIN_VALUE;
    String _string() default "";
    boolean _boolean() default true;
    float _float() default Float.MAX_VALUE;
    double _double() default Double.MAX_VALUE;
    Class _class() default I.class;
}
public class test057 {
    @I(_enum=Color.RED,
		_annotation=@Foo(),
		_int=2,
		_byte=1,
		_short=5,
		_long=Long.MIN_VALUE,
		_string="Hi",
		_boolean=true,
		_float=0.0f,
		_double=-0.0) void foo() {
    }
}
