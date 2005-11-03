public class test006 {
	@Foo({})
	void foo() {}
}
@interface Foo{
    int [] value() default {};
}
