package _10_Classes.Excercise1;

// created by Marcin 
public class ConstractorTv {
     
	private static boolean tvOn = true;
	
    public ConstractorTv(){
    	tvStatus();
    };
     
    public void tvStatus(){
    	if(!tvOn){
    		putItOn();
    	}else{
    		putItOff();
    	}
    }
    
    public void putItOn(){
    	tvOn = true;
        System.out.println("Tv is on");
    }
    
    public void putItOff(){
    	tvOn = false;
        System.out.println("Tv is off");
    }
    
}

