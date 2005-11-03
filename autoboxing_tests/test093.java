import java.util.HashMap;

public class test093 {

	public static void main(String[] args) {
		HashMap<Byte, Byte> subst = new HashMap<Byte, Byte>();
		subst.put((byte)1, (byte)1);
		if (1 + subst.get((byte)1) > 0.f) {
			System.out.println("SUCCESS");
		}		
	}
}
