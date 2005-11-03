public class test152 <E> {
	<U> void foo(){
			test152C<U> xcu = (test152C<U>) new test152<E>();
			test152C<U> xcu1 = (test152C<?>) new test152<E>();			
			test152C<?> xcu2 = (test152C<? extends test152>) new test152<E>();						
	}
}
class test152C<G> extends test152<G> {
}
