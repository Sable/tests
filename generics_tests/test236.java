public class test236 {
	public static void main(String[] args) {
		Number n= new Integer(1);
		X x = new X<Number>();
		x.m(n);
		x.m(new Integer(2));
		Y y= new Y();
		y.m(n);
		y.m(new Integer(2));
	}
}
class X<T> {
    public void m(Number num) { System.out.print("X.m(Number) =  "+ num + ','); }     public void m(T t) { System.out.print("X.m(T) = " + t + ','); }
}
class Y extends X<Number> {
   public void m(Number num) { System.out.print("Y.m(Number) = " + num + ','); }}

