import java.util.*;
public class test260<U extends Number> {
	List<? super Integer> lhs;
	List<? extends Number> rhs;
	{
		lhs.add(rhs.get(0));
	}
}
