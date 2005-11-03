public class test075 { 

    public static void main(String[] args) {
		test075Y xy = new test075Y();
		Class c1 = xy.getClass();
		Class<? extends test075Y> c2 = xy.getClass();
		String s = "hello";
		Class<? extends test075Y> c3 = s.getClass();
		System.out.println("SUCCESS");
    }
}

class test075Y extends test075 {
    public Class <? extends Object> getClass() {
        return super.getClass();
    }
}
