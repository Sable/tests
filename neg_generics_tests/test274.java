import java.util.*;
public class test274 {
	public static void main(String[] args) {
        List<MyTigerSimpleObject> list = new ArrayList<MyTigerSimpleObject>();
        list.add(new MyTigerSimpleObject("a"));
        list.add(new MyTigerSimpleObject("b"));
        
        for (MyTigerSimpleObject so : list)
            System.out.println(so.getSomeAttribute());		
	}
}
class MyTigerSimpleObject<E> {
	MyTigerSimpleObject(String s) {}
	E getSomeAttribute() { return null; }
}

class TigerList<MyTigerSimpleObject> extends ArrayList<MyTigerSimpleObject> {
    public void listAll() {
        for (MyTigerSimpleObject so : this)
            System.out.println(so.getSomeAttribute());
    }
	
}
