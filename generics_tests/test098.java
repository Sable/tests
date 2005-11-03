import java.util.ArrayList;
public class test098 {
    public static void main(String[] args) {
        ArrayList<Object> l;
        switch (args.length) {
        case 1:
            l = new ArrayList<Object>();
            System.out.println(l);
            break;
        default:
            System.out.println("SUCCESS");
            return;
        }
    }
}
