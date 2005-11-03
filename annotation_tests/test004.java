@interface Foo {
	String[] value() default {};
}

public class test004 {
	@Foo( {} )
	void foo() {}
}
