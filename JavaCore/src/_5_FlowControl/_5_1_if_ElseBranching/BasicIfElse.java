package _5_FlowControl._5_1_if_ElseBranching;

public class BasicIfElse {

	public static void main(String[] args) {
		
		boolean res = false;
		
		int[]numbers = new int[] {2, 10, 9, 3};
		
		Upper:for(int i = 0; i < numbers.length; i++) {
			System.out.println("Round " + i);		
			Lower:for(int j = 0; j < numbers.length; j++) {				
					System.out.println(numbers[j] + ", " + numbers[i]);					
					if (numbers[i] == numbers[j] - 1){
						System.out.println();
						System.out.println("1L:   " + numbers[i] + " = " + numbers[j] + " - " + 1);
						res = true;
					}
					if (numbers[i] == numbers[j] + 1){							
						System.out.println();
						System.out.println("2L:   " + numbers[i] + " = " + numbers[j] + " + " + 1);
						res = true;
					}					
			}System.out.println();			
			if(res == false) {
				System.out.println(res + " Array is not nice");
				break Upper;
			}
		}

	}

}
