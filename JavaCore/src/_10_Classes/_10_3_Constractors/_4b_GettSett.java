package _10_Classes._10_3_Constractors;

// created by Marcin 
public class _4b_GettSett {
	
        private String car;
        private String type;
        private String color;
        
    public void setCar(String n, String t, String c){
    	
        car = ((n.equals("Fiat") || n.equals("Warszawa")|| n.equals("Polonez")|| n.equals("Syrena")) ? n : "nie miales auta cieciu");
        type = ((t.equals("Sallon")||t.equals("Cabrio")||t.equals("Kombi")|| t.equals("Sedan")) ? t : null);
        color = ((c.equals("Red")||c.equals("Black")||c.equals("White")||c.equals("Yellow")) ? c : null);
    }
    public String getAnswer(){
        return (car + " " + type + " " + color);
    }
    public void sayWhat(){
        System.out.printf("My first car was %s\n", getAnswer());
    }

}

