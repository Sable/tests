import java.util.*;
public class test279 {
	public test279() {
		M m = new M();
		List<String> ls = m.list(); // rawified even though wasn't using T parameter
	}
	Zork z;
	static class M<T> {
		List<String> list() {
			return null;
		}
	}
}
