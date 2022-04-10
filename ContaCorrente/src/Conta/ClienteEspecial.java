
package Conta;


public class ClienteEspecial extends ClienteComun {
    private int numCartao;

    public ClienteEspecial() {
    }

    public ClienteEspecial(int numCartao) {
        this.numCartao = numCartao;
    }

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }
    public void mensagem(){
        System.out.println("\nCliente Especial\n");
    }
}
