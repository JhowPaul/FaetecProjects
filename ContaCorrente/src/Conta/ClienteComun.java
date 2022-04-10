
package Conta;


public class ClienteComun extends ContaCorrente{
    private int numCheque;
 
    public int getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(int numCheque) {
        this.numCheque = numCheque;
    }

    public ClienteComun(int numCheque) {
        this.numCheque = numCheque;
    }

    public ClienteComun() {
    }
   
    public void mensagem(){
        System.out.println("\nCliente Comum\n");
    }                

}
