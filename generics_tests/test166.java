import java.util.Vector;
public class test166 {
    public void foo() {
        Vector<Object> objectVector = new Vector<Object>() {
            protected void bar() {
                baz(this); /* ERROR */
            }
        };
        baz(objectVector);
        baz(new Vector<Object>());
    }
    public void baz(Vector<?> mysteryVector) { }
}
