    interface A<T> {
        T[] m1(T x);                          
    }
    public class test080 { 
    	public static void main(String[] args) {
			new test080().m2(new A<test080>(){ 
				public test080[] m1(test080 x) { 
					System.out.println("SUCCESS");
					return null;
				}
			});
		}
        void m2(A<test080> x) { 
            m3(x.m1(new test080())); 
        }
        void m3(test080[] x) {
        }                    
    }
