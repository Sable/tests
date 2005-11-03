public class test012 {
    public static enum Rank {FIRST,SECOND,THIRD;
            void bar() { foo(); } 
    }
    public void setRank(Rank rank){}
    void foo() {}
}
