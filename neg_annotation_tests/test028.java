@interface I {
     boolean[] value();
}

public class test028 {
     @I(value={false, test028.class != null }) void foo() {
     }
}
