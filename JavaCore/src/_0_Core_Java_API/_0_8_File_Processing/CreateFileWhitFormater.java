package _0_Core_Java_API._0_8_File_Processing;
import java.util.Formatter;

/** created by Marcin
 *  This program will create file according to your instruction 
 *  it will be the part of data base filling application
 **/ 
public class CreateFileWhitFormater {
    
		// this method takes directory path and name of file we want to create
	
        public static String CreateFile(String direction, String name){    
            String result = "";
                try{   
                   Formatter x = new Formatter(direction + name + ".txt");
                   result = "You created a file";
                }catch(Exception e){
                   result = "There is an error";
                }
            return result;
        }
        
        public static void main(String args[]){
            
            System.out.println(CreateFile("E:\\Kody i programy z kursu\\JavaEclipseCode\\Essential java API\\BasicIO\\","ale jest lipa"));
        }

}

