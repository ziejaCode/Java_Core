package _1_variables._1_2_Arrays;

import java.util.Arrays;

// created by Marcin 
public class copyArray {
        public static void main(String args[]){

        	int[]nums = {2,4,6};
        	
        	int[]ints = Arrays.copyOf(nums, 2);
        	
        	System.out.println("hash code 1 " + nums.hashCode());
        	for(int i: nums){
                System.out.print(i);
        	}    
        	System.out.println("\nhash code 2 " + ints.hashCode());
        	for(int j: ints){
                System.out.print(j);
        	}
        	System.out.println("\nhash code 3 " + Arrays.toString(nums));

        }

}

