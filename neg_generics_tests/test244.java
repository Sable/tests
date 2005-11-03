import java.util.List;

public class test244 {
	
 void add(List<? super test244> l) { 
 	l.add(new test244()); 
 }
 void add2(List<? extends test244> l) { 
 	l.add(new test244()); 
 }
 
 static <T> void add3(List<T> l, List<T> l2) { 
 }
 public static void main(String[] args) {
	List<test244> lx = null;
	List<String> ls = null;
	add3(lx, ls);
 } 
}
