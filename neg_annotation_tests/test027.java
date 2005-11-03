@interface I {
    boolean val() default true;
}

public class test027 {

	boolean bar() {
		return false;
	}
    @I(val = bar()) void foo() {
    }
}
