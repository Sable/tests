public class test056<T> {
    T t;
    test056(T t) {
        this.t = t;
    }
     void foo() {
         test056<String> xs = new test056<String>("");
         test056<String> xs2 = (test056<String>) xs;
         
         ((test056)xs).t = this;
         
         System.out.prinln((T) this.t);
     }
     public static void main(String[] args) {
		new test056<String>("SUCCESS").foo();
	}
}
