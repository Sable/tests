@interface Foo {
	Class value() default test017.clazz();
}

public class test017 {
	@Foo( clazz() )
	void foo() {}
	static Class clazz() { return test017.class; }
}
