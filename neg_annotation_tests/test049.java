@interface Foo {}

@interface Bar {
    Foo[] foo() default "";
}

@Bar(foo="")
public class test049 { 
}
