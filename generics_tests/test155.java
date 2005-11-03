
class A<BB extends B>
{}

class B<AA extends A>
{}

public interface test155<C extends B<?>, D extends A<?>>
{}

class AbstractA extends A<AbstractB> {};
class AbstractB extends B<AbstractA> {};

class test155A<E extends AbstractB, F extends AbstractA> implements test155<E, F>
{}
