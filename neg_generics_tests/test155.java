import java.util.List;
public class test155 {
    public List useList(List l) {
        l.add("asdf");
        return l;
    }
}
class Y extends test155 {
    public List<String> useList(List<String> l) {
        l.add("asdf");
        return l;
    }
}
