package Assertion;

public class SimpleAssertionUse {
	
	public static boolean Aa(){
		
		int age = 74;
		int sum = 3;
		
		assert (age > 60 && age < 110): "dupa " ;
		
		if(age > 60)
			return true;
		else
			return false;
		
	}		
	
	public static void main(String args[]){		
				
		System.out.println(Aa());
		
		
		
	}

}
