import java.util.*;
class MyList extends ArrayList<String> {
}

public class test280 {
    public static void main(String[] args) {
        List<? extends String> a = new MyList();
        List<String> b = (MyList) a;     
    }
	Zork z;
}
