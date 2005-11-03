import java.util.List;
public class test157 {
    public void useList(List l) {}
}
class Y extends test157 {
    public void useList(List<String> l) {
		super.useList(l);
	}
}
