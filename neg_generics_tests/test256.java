import java.util.List;

public class test256 {
    void method(List<? super Number> list) {
        list.add(new Object());   // should fail
        list.add(new Integer(3)); // correct
    }
}
