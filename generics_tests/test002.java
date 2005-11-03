public class test002<test002p1 extends String, test002p2 extends Comparable>  extends test002S<test002p2> {

    public static void main(String[] args) {
        Integer w = new test002<String,Integer>().get(new Integer(12));
        System.out.println("SUCCESS");
    }
    test002p2 get(test002p2 t){
        System.out.print("{test002::get}");
        return super.get(t);
    }
}

class test002S <test002Sp1> {
    test002Sp1 get(test002Sp1 t) {
        System.out.print("{test002S::get}");
        return t;
    }
}
