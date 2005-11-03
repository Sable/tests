import java.util.HashMap;
import java.util.Map;
public class test134 {
    private static final Map<String, Class> classes = new HashMap<String, Class>();
    public static void main(String[] args) throws Exception {
    	classes.put("test", test134.class);
        final Class<? extends Object> clazz = (Class<? extends Object>) classes.get("test");
        Object o = clazz.newInstance();
    }
}
