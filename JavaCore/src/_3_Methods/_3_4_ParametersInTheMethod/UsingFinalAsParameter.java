package _3_Methods._3_4_ParametersInTheMethod;

// created by Marcin
// this code present passing final as the parameter to the method
// this process can be usefull if you want to conduct some calculations 
public class UsingFinalAsParameter {
    
        final static double NUMER = 34.00;
      
        public static double rata(final double dub){ // here we define method with final
            double wynik = dub / 8.00;               // parameter    
            return wynik;
        }
    
        public static void main(String args[]){
            
        	System.out.println(rata(NUMER));
        }

}

