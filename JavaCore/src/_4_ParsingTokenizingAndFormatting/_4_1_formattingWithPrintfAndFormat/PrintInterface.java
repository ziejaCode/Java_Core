package _4_ParsingTokenizingAndFormatting._4_1_formattingWithPrintfAndFormat;

import java.io.Console;
import java.util.Scanner;

public class PrintInterface {
	public static void main(String[]args){
		
		  Scanner s = new Scanner(System.in);
		  
		  Console c = System.console();
		
		  String id = c.readLine("%s", "Enter UserId:"); 			//1
		  
		  System.out.println("userid is " + id); 					//2
		  
		  char[] pwd = c.readPassword("%s", "Enter Password :"); 	//3
		  
		  System.out.println("password is " + pwd); 				//4

	}
}
                                                    