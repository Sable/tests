public class test012 <T> {
    T t;
    test012(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        String s = new test012<String>("SU").t;
        System.out.print(s);
        s = new test012<String>("failed").t = "CC";
        System.out.print(s);
        s = new test012<String>("").t += "ESS";
        System.out.println(s);
    }
}
