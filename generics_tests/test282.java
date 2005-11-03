class test282 extends A<String> {
    test282() {
        super(null);
    }
}
class A<P> {
    protected P p;
    protected A(P p) {
        this.p = p;
    }
}
