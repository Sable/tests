
public class test001 {
    public static void main(String[] args) {
    	System.out.print("JDTCore team:");
    	T oldest = null;
    	int maxAge = Integer.MIN_VALUE;
    	for (T t : T.values()) {
            if (t == T.YODA) continue;// skip YODA
            t.setRole(t.isManager());
			 if (t.age() > maxAge) {
               oldest = t;
               maxAge = t.age();
            }
            System.out.print(" "+ t + ':'+t.age()+':'+location(t)+':'+t.role);
        }
        System.out.println(" WINNER is:" + T.valueOf(oldest.name()));
    }

   private enum Location { SNZ, OTT }

    private static Location location(T t) {
        switch(t) {
          case PHILIPPE:  
          case DAVID:
          case JEROME:
          case FREDERIC:
          	return Location.SNZ;
          case OLIVIER:
          case KENT:
            return Location.OTT;
          default:
            throw new AssertionError("Unknown team member: " + t);
        }
    }
}
enum T {
	PHILIPPE(37) {
		public boolean isManager() {
			return true;
    	}
	}, 
	DAVID(27),
	JEROME(33),
	OLIVIER(35),
	KENT(40), 
	YODA(41),
	FREDERIC;

    enum Role { M, D }

    int age;
	Role role;

	//T() { this(YODA.age()); } // TODO (philippe) should this not complain: illegal reference to static field from initializer
	T() { this(27); }
    T(int age) {
		this.age = age;
	}
	public int age() { return this.age; }
	public boolean isManager() { return false; }
	void setRole(boolean mgr) {
		this.role = mgr ? Role.M : Role.D;
	}
}

