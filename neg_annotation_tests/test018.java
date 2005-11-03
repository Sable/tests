@interface Foo {
	int value() default test018.val();
}

public class test018 {
	@Foo( val() )
	void foo() {}
	static int val() { return 0; }
}
