@interface I {
    char value() default ' ';
}

public class test042 {
    @I('@') void foo() {
    }
}
