package _9_Package_jar_and_deployment.newpackage;

import _9_Package_jar_and_deployment.oldPackage.ClassToBeImported1;
import _9_Package_jar_and_deployment.oldPackage.ClassToBeImported2;
import _9_Package_jar_and_deployment.oldPackage.StaticFinalStuff;

/**
 * @author Marcin
 */
public class CallAllTheRest {    
    public static void main(String args[]){
        
// now we have start to place methods calls
        
//        MethodNum1();
       ClassToBeImported1 c1 = new ClassToBeImported1("Franek"); 
       c1.MethodNum2();
       
       ClassToBeImported2 c2 = new ClassToBeImported2("Heniek",4); // another way to import class
       
    
       TheClassToBeCalledFromTheSomePackage t1 = new TheClassToBeCalledFromTheSomePackage();
       t1.MethodNumer3();
       t1.MethodNum2();
    
        StaticFinalStuff stuff = new StaticFinalStuff();
    }

    

}
