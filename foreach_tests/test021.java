import java.util.ArrayList;

public class test021 {

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
    	 arr.add(0);
    	 arr.add(1);
		 int counter = 0;
        // tested statement:
        for (int i : arr){
            ++counter;
        }
        System.out.print("SUCCESS");
    }
}