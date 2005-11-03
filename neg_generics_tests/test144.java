import java.util.*;
public class test144 {
    public static void main(String[] args) {
        List<Integer> li= new ArrayList<Integer>();
        List<? extends Number> ls= li;       
        List<Number> x2= (List<Number>)ls;//unsafe
        x2.add(new Float(1.0));
        
        Integer i= li.get(0);//ClassCastException!
        
        List<Number> ls2 = (List<? extends Number>)ls;
        List<? extends Number> ls3 = (List<? extends Number>) li;
    }
}
