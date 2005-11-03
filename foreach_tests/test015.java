import java.util.ArrayList;

public class test015 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(new Integer(i));
		}
		int sum = 0;
		for (Integer e : arrayList) {
			sum += e.intValue();
		}
		System.out.println(sum);
	}
}