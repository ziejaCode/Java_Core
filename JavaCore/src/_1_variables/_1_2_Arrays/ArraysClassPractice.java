package _1_variables._1_2_Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysClassPractice {
	
	int[]integ =  new int[] {4, 2, 1};
	
	public static void main(String[]args) {
		
		System.out.println(new ArraysClassPractice().runIt(new int[] {4, 2, 1}));
	}

	
	
	private Stream runIt(int[]integ) {
		
		Stream str =  (Stream) Arrays.stream(integ);
		
		return str;
		
	}

	
	
	

}
