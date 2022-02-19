package _1_variables._1_10_Var_type;

public class whatTypeAmI {

	public static void main(String[] args) {
		whatType();
	}
	
	/**
	 * keyword var allow to create variable without type specified. and assigned 
	 * whateever type we want.
	 *  
	 **/
	public static void whatType() {
		   String name = "Hello";
		   int size = 7;
		   System.out.println(name);
		   System.out.println(size);
		   name = "Bolo";
		   //size = "trolo"; // type cannot be changed after runtime like in python
		   System.out.println(name);
		   System.out.println(size);
	}

}
