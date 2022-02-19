package _10_Classes._10_4_declareInterfaces;

//import _6a_interfaces.NewInterface;

class man implements ceramicToy,toy,electricDivaice,NewInterface{

    
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //
    }

    
    public void dupa() {
        throw new UnsupportedOperationException("Not supported yet."); //
    }

    
    public void metoda2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public String metoda4(String answer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public void metoda() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public String metoda3(String answer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

interface toy{
    void play();
}
interface ceramicToy extends toy{
     void dupa(); 
}
interface electricDivaice{
    
}


