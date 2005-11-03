@interface Foo {
	String[] value() default null;
}

public class test020 {
	@Foo( null )
	void foo() {}
}
