class G<T> {
	class Member {}
}
public class test179 {
	G<String> g = new G();
	G<String>.Member gsm = g.new Member();
	G.Member gm = null;
	G<Thread>.Member gtm = gm;
	Zork z;
}
