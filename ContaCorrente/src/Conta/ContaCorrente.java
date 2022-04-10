
package Conta;


public class ContaCorrente implements ContaInterface{
    private int numCartao;
    private String nome;
    private int depositar;
    private int sacar;
    private int saldo; 
    private double taxa;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDepositar() {
        return depositar;
    }

    public void setDepositar(int depositar) {
        this.depositar = depositar;
    }

    public int getSacar() {
        return sacar;
    }

    public void setSacar(int sacar) {
        this.sacar = sacar;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public ContaCorrente(int numCartao, String nome, int depositar, int sacar, int saldo, double taxa) {
        this.numCartao = numCartao;
        this.nome = nome;
        this.depositar = depositar;
        this.sacar = sacar;
        this.saldo = saldo;
        this.taxa = taxa;
    }

    public ContaCorrente() {
    }

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }
    public void CalcTaxa(){
        this.taxa=(this.sacar*this.taxa)/100;
        System.out.println("valor da taxa ="+this.taxa);
    }

    @Override
    public void mensagem() {
        System.out.println("\nConta Corrente\n");
    }
}
