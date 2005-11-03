@interface I {
    Class[] classes();
}

public class test052 {
    @I(classes = {X.class, I.class}) public void foo(){
    }
}
