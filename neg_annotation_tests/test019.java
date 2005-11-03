@interface Foo {
	String value() default test019.val();
}

public class test019 {
	@Foo( val() )
	void foo() {}
	static String val() { return ""; }
}
