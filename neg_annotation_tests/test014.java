@Foo(
		id = "hello") public class test014 {
}

@interface Foo {
	String id() default "";
	String value() default "";
	String foo();
}
