import java.util.List;

public class test257 {
    void method(List<? super Number> list, List<Object> lo) {
    	list = lo;
    	lo = list;
    }
}
