public class test131 <T1 extends test131<T1, T2>, T2 extends B<T1, T2>> {
    public static void main(String [] args) {
		System.out.println("SUCCESS");
    }
}
class B<T3 extends test131<T3, T4>, T4 extends B<T3, T4>>{}
