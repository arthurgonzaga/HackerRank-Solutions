package solution1;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
	
	static int[] ar;
	static int arCount;

    public static void main(String[] args){
    	
    	readInput();
        System.out.println(simpleArraySum(ar, arCount));
    }
    
    

    
    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar, int count) {
    	int sum = 0;
    	for(int item : ar) {
    		sum+= item;
    	}
    	return sum;
    }




	public static void readInput() {
		System.out.print("");
		Scanner scanner = new Scanner(System.in);
    	arCount = Integer.parseInt(scanner.nextLine().trim());
        ar = new int[arCount];
        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }
        scanner.close();
		
	}



}