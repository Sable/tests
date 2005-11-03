import java.util.Iterator;

public class test008 {
    public static void main(String[] args) {
		for (Thread s : new AX()) {
		}
	}
}

class AX implements Iterable<String> {
    
   public Iterator<String> iterator() {
        return null;
    }
}
