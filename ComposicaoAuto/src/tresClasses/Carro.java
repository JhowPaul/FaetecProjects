
package tresClasses;


public class Carro {


 Motor motor=new Motor();
 Direcao direcao=new Direcao();

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

   public Carro(){
       
   }
    public Carro(Motor motor, Direcao direcao) {
        this.motor = motor;
        this.direcao = direcao;
    }

    public void imprimir(){
        System.out.println("direcao"+this.direcao);   
   }


    
}
