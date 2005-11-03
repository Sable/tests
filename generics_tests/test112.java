public class test112 {
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
	    x.setVal(new Long(0));
	}
	public static void main(String[] args) {
	    Container<Integer> cont = new Container<Integer>();
		cont.next = new Container<Integer>();
	    cont.next.setVal(new Integer(0));
	    badMethod(cont.next);
	    Number someVal = cont.next.val;// only cast to Number 
	    System.out.println("SUCCESS"); 
	}
}
