package _10_Classes._10_1_Class;
/** @author Marcin
 *  This application is about different member of classes 
 **/
public class DeclaringMemberVariables {
    
    public int numer1 = 45; // this is "Field" or instant or class variable 
                            // initialized
    int numer2;             // uninitialized
    
    public static void main(String []args){
   
        // local variables is  the one that is placed in any method or 
        // code block
        int numer3 = 34;
        
        // locals cannot be public, private  but they can be final     
        final int a;
        
        parameter(23); // this is "unformal parametr" always in method call

    }
    public static void parameter(int num){ // this is "formal parameter" also member variale always in method declarations
        
    
    }
    
    
    
}
