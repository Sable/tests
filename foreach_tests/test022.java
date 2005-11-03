import java.util.ArrayList;

public class test022 {

    public static void main(String args[]) {
        int[] arr = new int[2];
    	 arr[0]= 0;
    	 arr[1]= 1;
		 int counter = 0;
        // tested statement:
        for (int i : arr){
            ++counter;
        }
        System.out.print("SUCCESS");
    }
}