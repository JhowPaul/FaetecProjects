
package tresClasses;


public class Motor {
    private double potencia;
    private String combustivel;
    private String chassi;
    Carro carro;
    Direcao direcao;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
    
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Motor(){
        
    }
    
    public Motor(double potencia, String combustivel, String chassi) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.chassi = chassi;
    }
    

    
}
