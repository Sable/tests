import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class test207
{
    public static <T> List<T> emptyList() {
        return new ArrayList<T>();
    }
    public static <T> Collection<T> emptyCollection() {
        return new ArrayList<T>();
    }
    public static <T> Iterable<T> emptyIterable() {
        return new ArrayList<T>();
    }
    
    public static void main(String[] args) {
    	 // generic inference using expected lhs type: T --> String
        final List<String> lL = emptyList(); // 1
        
    	 // generic inference using expected cast type: T --> String
        final Collection<String> cL = (Collection<String>)emptyList(); // 2
        
    	 // generic inference using expected cast type: T --> String
        final Iterable<String> iL = (Iterable<String>)emptyList(); // 3
        
    	 // generic inference using expected lhs type: T --> String
        final Collection<String> cC = emptyCollection(); // 4
        
    	 // generic inference using expected cast type: T --> String
        final Iterable<String> iC = (Iterable<String>)emptyCollection(); // 5
        
    	 // generic inference using expected lhs type: T --> String
        final Iterable<String> iI = emptyIterable(); // 6
        
    	 // generic inference using expected lhs type: T --> String
        final Collection<String> cL2 = emptyList(); // 7
        
    	 // generic inference using expected lhs type: T --> String
        final Iterable<String> iC2 = emptyCollection(); // 8
    }
}