public class test106 {
 	static class Container<T>{
	    private T val;
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
	    Container<Integer> cont=new Container<Integer>();
	    cont.setVal(new Integer(0));
	    badMethod(cont);
	    Number someVal = cont.getVal();// only cast to Number 
	    System.out.println("SUCCESS"); 
	}
}
