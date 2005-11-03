public class test150 <E,F> {
	void foo(){
		test150C<E,String> xe = (test150C<E,String>) new test150<String,String>();
	}
}
class test150C<G,H> extends test150<G,H> {
}
