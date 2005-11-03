@interface I {
    int[][] ids();
    Object[][] obs();
}

public class test031 {

    @I(ids = {{1 , 2}, { 3 }}) public void foo(){
    }
}
