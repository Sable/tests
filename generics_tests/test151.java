import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class test151 {
void takeAbstract(AbstractList<? extends InetAddress> arg) { }

void takeList(List<? extends InetAddress> arg) { }

void construct() {
	AbstractList<InetAddress> a= new ArrayList<InetAddress>();
	takeAbstract(a);
	takeAbstract(new ArrayList<InetAddress>()); // a inlined: error 1:
//The method takeAbstract(AbstractList<? extends InetAddress>) in the type A
// is not applicable for the arguments (ArrayList<InetAddress>)
	
	List<InetAddress> l= new ArrayList<InetAddress>();
	takeList(l);
	takeList(new ArrayList<InetAddress>()); // l inlined: ok
	
	ArrayList<? extends InetAddress> aw= new ArrayList<InetAddress>();
	takeAbstract(aw);
	takeAbstract(new ArrayList<Inet6Address>()); // aw inlined: error 2:
//The method takeAbstract(AbstractList<? extends InetAddress>) in the type A
// is not applicable for the arguments (ArrayList<Inet6Address>)

	takeList(aw);
	takeList(new ArrayList<Inet6Address>()); //aw inlined: ok
}
}