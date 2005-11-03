import java.util.ArrayList;

public class test154 {
    public void test(boolean param) {
        ArrayList<?> ls = (param) 
        		? new ArrayList<String>()
        		: new ArrayList<Object>();
        		
        test154 x = param ? new test154Y() : new test154Z();
        test154Y y = (test154Y) new test154Z();
    }
}
class test154Y extends test154 {}
class test154Z extends test154 {}
