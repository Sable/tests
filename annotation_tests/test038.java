@interface I {
    String value() default "Hello";
}

public class test038 {
    @I("Hi") void foo() {
    }
}
