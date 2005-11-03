public enum test009 {
    JANUARY   (30),
    FEBRUARY  (28),
    MARCH     (31),
    APRIL     (30),
    MAY       (31),
    JUNE      (30),
    JULY      (31),
    AUGUST    (31),
    SEPTEMBER (31),
    OCTOBER   (31),
    NOVEMBER  (30),
    DECEMBER  (31);
    
    private final int days;
    
    test009(int days) {
        this.days = days;
    }
    
    public int getDays() {
    	boolean leapYear = true;
    	switch(this) {
    		case FEBRUARY: if(leapYear) return days+1;
    	}
    	return days;
    }
    
    public static void main(String[] args) {
    	System.out.println(JANUARY.getDays());
    }
    
}
