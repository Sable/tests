public class test213 <T> {
    test213(){
    }
    public static void main(String[] args) {
		new test213<?>();
		new test213<? extends String>();
		new test213<?>(){};
		new test213<? extends String>(){};
	}
}
