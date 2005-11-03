@interface Foo {}

@interface Bar {
    Foo[] foo() default null;
}

@Bar(foo=null)
public class test048 { 
}
