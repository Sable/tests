public class test143 {
    static interface I extends Visitible<I> {
    }
    static interface Visitible<T> {
        void acceptVisitor(Visitor<? super T> visitor);
    }
    static interface Visitor<T> {
        void visit(T t);
    }
    static class C implements I {
        public void acceptVisitor(Visitor<? super I> visitor) {
            visitor.visit(this); // should be ok
            visitor.visit((I) this); // (2) This is a workaround
        }
    }
    public static void main(String [] args) {
        System.out.println("SUCCESS");
    }
}
