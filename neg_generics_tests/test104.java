import java.util.*;

public class test104 {
	
	{
		Dictionary<String, Integer> d;
		Object o;
		
		Object a1 = (Hashtable<String,Integer>) d;
		Object a2 = (Hashtable) o;

		Object a3 = (Hashtable<Float, Double>) d;
		Object a4 = (Hashtable<String,Integer>) o;
		
		abstract class Z1 extends Hashtable<String,Integer> {
		}
		Z1 z1;
		Object a5 = (Hashtable<String,Integer>) z1;

		abstract class Z2 extends Z1 {
		}
		Object a6 = (Z2) z1;

		abstract class Z3 extends Hashtable {
		}
		Z3 z3;
		Object a7 = (Hashtable<String,Integer>) z3;
	}
}
