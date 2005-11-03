import java.util.*;
public class test251<U extends Number> {
	List<? super Number> lhs;
	List<? extends U> rhs;
	{
		lhs.add(rhs.get(0));
	}
}
