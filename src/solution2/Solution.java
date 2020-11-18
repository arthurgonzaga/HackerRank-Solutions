package solution2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	
    	int pointsA = 0;
    	int pointsB = 0;

    	for(int i=0;i<a.size();i++) {
    		if(a.get(i) > b.get(i)) pointsA++;
    		else if(a.get(i) < b.get(i)) pointsB++;
    	}
    	
    	return List.of(pointsA, pointsB);
    }

    public static void main(String[] args){
    	List <Integer> a = List.of(17, 28, 30);
    	List <Integer> b = List.of(99, 16, 8);
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.toString());
    }
}
