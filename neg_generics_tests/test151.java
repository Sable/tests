public class test151 <E,F> {
	void foo(){
		test151C<E,String> xe = (test151C<E,String>) new test151<String,Integer>();
	}
}
class test151C<G,H> extends test151<G,H> {
}
