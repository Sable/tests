import java.util.List;
public class test158 {
    public void useList(List<String> l) {}
}
class Y extends test158 {
    public void useList(List l) {
		super.useList(l);
	}
}
