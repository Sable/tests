import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import orders.DiscreteOrder;
import orders.impl.IntegerOrder;
import orders.impl.IntegerOrder2;

public class test230 {

    public static void main(String[] args) throws SecurityException,
            NoSuchMethodException, IllegalArgumentException,
            IllegalAccessException {
        test230 test = new test230();

        for (String method : new String[] { "test1", "test2", "test3", "test4" }) {
            Method m = test.getClass().getMethod(method);
            try {
                m.invoke(test);
                System.out.print("*** " + m + ": success");
            } catch (InvocationTargetException e) {
                System.out.print("*** " + m + ": failed, stacktrace follows");
                e.getCause().printStackTrace(System.out);
            }
        }
    }

    public void test1() { // works
        new IntegerOrder().next(new Integer(0)); // works
    }

    public void test2() { // doesn't work
        final DiscreteOrder<Integer> order = new IntegerOrder();
        order.next(new Integer(0));
    }

    public void test3() { // works
        new IntegerOrder2().next(new Integer(0)); // works
    }

    public void test4() { // doesn't work
        final DiscreteOrder<Integer> order = new IntegerOrder2();
        order.next(new Integer(0));
    }
}
