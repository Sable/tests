public class GenStatic<X> {

    static void foo(X x){}
}
class M{

    public void boo(){
        GenStatic<Integer>.foo(new Integer(9));
    }
}
