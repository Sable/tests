public class test111 {
 	static class Container<T>{
	    public T val;
		Container<T> next;
	    public T getVal() {
	        return val;
	    }
	    public void setVal(T val) {
	        this.val = val;
	    }
	}
	public static void badMethod(Container<?> param){
	    Container x=param;
	    x.setVal("BAD");
	}
	public static void main(String[] args) {
	    Container<Integer> cont = new Container<Integer>();
		cont.next = new Container<Integer>();
	    cont.next.setVal(new Integer(0));
	    badMethod(cont.next);
	    Object someVal = cont.next.val; // no cast 
	    System.out.println(cont.next.val); // no cast 
	}
}
