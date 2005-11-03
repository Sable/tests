import java.util.*;
public class test182 {
    class List1<E> extends LinkedList<E> {};
    public static void main (String[] args) {
        Map<String, List<Integer>> x = new HashMap<String, List<Integer>>();
        Map<String, List1<Integer>> m = new HashMap<String, List1<Integer>>();
    }
}