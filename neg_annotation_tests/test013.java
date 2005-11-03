@Foo("hello") public class test013 {
}

@interface Foo {
	String id() default "";
	String value() default "";
	String foo();
}
