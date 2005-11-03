public  class test144 {
  	public static void main(String[] args) {
  		Y<String> ys = new Y<String>();
	    Y<String>.Member m = ys.new Member();
	    m.foo();
  	}    
  }
  class Y<T> {
    class Member {
    	void foo(){
    		System.out.println("SUCCESS");
    	}
    }
  }

