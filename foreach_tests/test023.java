import java.util.ArrayList;

public class test023 {

    public static void main(String args[]) {
        ArrayList arr = new ArrayList();
    	 arr.add(new Object());
		 int counter = 0;
        // tested statement:
        for (Object o : arr){
            ++counter;
        }
        System.out.print("SUCCESS");
    }
}