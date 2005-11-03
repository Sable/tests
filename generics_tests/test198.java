import java.util.AbstractSet;
import java.util.Iterator;
public class test198 extends AbstractSet<Runnable>{
    public static void main(String[] args) {
        test198 t=new test198();
        t.add(null);
    }
    public boolean add(Runnable run) {
        System.out.println("success");
        return true;
    }
    public Iterator<Runnable> iterator() {return null;}
    public int size() {return 0;}
}