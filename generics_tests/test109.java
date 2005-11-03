public class test109 {
 	static class Container<T>{
	    public T val;
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
	    Container<Integer> cont=new Container<Integer>();
	    cont.setVal(new Integer(0));
	    badMethod(cont);
	    Object someVal = (cont).val; // no cast 
	    System.out.println((cont).val); // no cast 
	}
}
