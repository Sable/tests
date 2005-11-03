import java.lang.annotation.*;
import java.lang.reflect.Method;

public class test075 {
    public static void main(String[] args) {
        Object o = new test075();
        for (Method m : o.getClass().getMethods()) {
            if (m.isAnnotationPresent(MyAnon.class)) {
                System.out.println(m.getAnnotation(MyAnon.class).c());
            }
        }
    }
    @MyAnon(c = test075.class) 
    public void foo() {}

    @Retention(RetentionPolicy.RUNTIME) 
    public @interface MyAnon {
        Class c();
    }
    public interface I {
    }
}