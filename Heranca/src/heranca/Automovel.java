
package heranca;


public class Automovel extends Terrestre{
    private String numPlaca;
    private int numPortas;
    

    public Automovel(){
        
    }

    public Automovel(String numPlaca, int numPortas) {
        this.numPlaca = numPlaca;
        this.numPortas = numPortas;
    }
    
    
    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
