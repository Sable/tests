import java.util.*;
public class test258<T extends Number> {
	List<? super T> lhs;
	List<? extends Number> rhs;
	{
		lhs.add(rhs.get(0));
	}
}
