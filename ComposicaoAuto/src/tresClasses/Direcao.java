
package tresClasses;


public class Direcao {
private String cor;
private double tamanhoRaio;
private boolean  kitMultimidia;
Carro carro;
Motor motor;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanhoRaio() {
        return tamanhoRaio;
    }

    public void setTamanhoRaio(double tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }

    public boolean isKitMultimidia() {
        return kitMultimidia;
    }

    public void setKitMultimidia(boolean kitMultimidia) {
        this.kitMultimidia = kitMultimidia;
        kitMultimidia=false;
    }

    public Direcao(){
        
    }
    public Direcao(String cor, double tamanhoRaio, boolean kitMultimidia) {
        this.cor = cor;
        this.tamanhoRaio = tamanhoRaio;
        this.kitMultimidia = kitMultimidia;
        kitMultimidia=true;
    }
    private void Multimidia(){
        if (kitMultimidia==true) {
            System.out.println("Possui kit");
        }
        else{
            System.out.println("Não possui kit");
        }
    
    }

    
  
   

    

    
}
