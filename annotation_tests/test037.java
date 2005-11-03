@interface I {
    String[] value();
}

public class test037 {
    @I("Hello") void foo() {
    }
}
