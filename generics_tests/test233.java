import java.util.*;

interface Alpha<
	A1 extends Alpha<A1, B1>, 
	B1 extends Beta<A1, B1>> {
}
interface Beta<
	A2 extends Alpha<A2, B2>, 
	B2 extends Beta<A2, B2>> {
}
interface Phi<
	A3 extends Alpha<A3, B3>, 
	B3 extends Beta<A3, B3>> {
	
	public void latinize(A3 s);
}

public class test233<
	A extends Alpha<A, B>, 
	B extends Beta<A, B>, 
	P extends Phi<A, B>> extends ArrayList<P> implements Phi<A, B> {
	
	public final void latinize(A a) {
		frenchify(this, a); // (test233<A,B,P>, A)
	}
	// -----------------------------------------------------------------
	public static final <AA extends Alpha<AA, BB>, BB extends Beta<AA, BB>> 
	void frenchify(Collection< ? extends Phi<AA, BB>> phis, AA aa) {
		for (final Phi<AA, BB> phi : phis)
			phi.latinize(aa);
	}
}
