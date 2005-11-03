@Foo("hello") public class test002 {
}

@interface Foo {
	String id() default "";
	String value() default "";
}
