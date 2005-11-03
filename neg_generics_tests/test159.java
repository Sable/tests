public class test159 implements ISomething {
    public Class getSomething() { return null; }
}
class Y {}
interface ISomething {
    public Class<? extends Y> getSomething();
}
