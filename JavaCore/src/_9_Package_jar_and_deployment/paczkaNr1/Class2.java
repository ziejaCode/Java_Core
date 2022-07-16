package _9_Package_jar_and_deployment.paczkaNr1;
//import API.ProfitCalculations;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * @author Marcin
 */
public class Class2 implements _9_Package_jar_and_deployment.API.Calculations{
    
        double value;
        int amount;
    
        public static void main(String args[]) throws IOException{

           

//            ProfitCalculations pr = new ProfitCalculations();
//            
//            System.out.println("I sucesfully extracted " + pr.bondsshareProfit() + " this value");

        }

    @Override
    public double CalculateCostOfTransaction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double CalculateProfits() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
