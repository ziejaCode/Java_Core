package _3_Methods._3_4_ParametersInTheMethod;

import java.util.Scanner;

public class AddressInterface {

	Scanner key = new Scanner(System.in);
	static String address = "";
	static int sizeOfArray;
	
	public void Address(){
		
		String word = key.next();
		address =  address + "" + word + ", ";
		System.out.println("Your entry was " + word);			
		
//		
//		
	}
	public  String GetAddress(){
		return address;
	}
	
	public static void main (String args[]){
		
		Scanner key = new Scanner(System.in);
		AddressInterface ct = new AddressInterface();
		System.out.println("How big your array has to be? ");
		sizeOfArray = key.nextInt();	
		for(int i = 0; i < sizeOfArray; i++){
			ct.Address();
		}
		
		System.out.println("Your address is " + ct.GetAddress());
		
		
	}
	
	
	
}
