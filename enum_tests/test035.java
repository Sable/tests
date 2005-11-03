public enum test035 {
    SUCCESS (0) {};
    private test035(int i) {}
    public static void main(String[] args) {
       for (test035 x : values()) {
           System.out.print(x);
       }
    }
}