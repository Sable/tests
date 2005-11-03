import java.lang.annotation.Inherited;

@Deprecated
@Inherited
class A {
}

class B extends A {
}

class C extends B {
}

public class test041 {
	C c;
}
