package _8_AssertionAndExceptions.Finally;

// created by Marcin 
public class TryCatchFinallly {
        public static void main(String args[]){

            try{
                if((24 / 1) == 12)throw new ArithmeticException("from try is printed");
//                System.out.println("from try is printed");
            }catch (ArithmeticException ex){
                System.out.println("from try is printed");
            }finally{
//                throw new ClassCastException("from finally is printed");
                System.out.println("from finally is printed");
            }


        }

}

