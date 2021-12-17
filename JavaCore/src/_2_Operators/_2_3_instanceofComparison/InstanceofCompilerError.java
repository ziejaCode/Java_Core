package _2_Operators._2_3_instanceofComparison;


/**
 * You can't use the instanceof operator to test across two different class hierarchies
 */
class Cat{}

public class InstanceofCompilerError {

	public static void main(String[] args) {
		
		InstanceofCompilerError d = new InstanceofCompilerError();
		Cat c = new Cat();
		
//		System.out.println(d instanceof Cat); // this will cause compiler error

	}

}
