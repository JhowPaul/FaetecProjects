
package Conta;


public class Main {
    public static void main(String[] args) {
        
    ClienteComun conta1= new ClienteComun();
    ClienteEspecial conta2=new ClienteEspecial();
    
    
    conta1.setNome("joao");
    conta1.setNumCheque(5555);
    conta1.setDepositar(20);
    conta1.setSaldo(5000);
    conta1.setSacar(130000);
    conta1.setTaxa(0.5);
    conta1.CalcTaxa();
    
   
    conta2.setNome("paulo");
    conta2.setNumCartao(2222);
    conta2.setDepositar(300);
    conta2.setSaldo(6000);
    conta2.setSacar(40000);
    conta2.setTaxa(0.1);
    conta2.CalcTaxa();
        
       
        conta1.mensagem();
        System.out.println("Nome: "+conta1.getNome());
        System.out.println("cheque: "+conta1.getNumCheque());
        System.out.println("Deposito: "+conta1.getDepositar());
        System.out.println("Saldo: "+conta1.getSaldo());
        System.out.println("Sacar: "+conta1.getSacar());
        System.out.println("Taxa: "+conta1.getTaxa());
        

        conta2.mensagem();        
        System.out.println("Nome: "+conta2.getNome());
        System.out.println("cheque: "+conta2.getNumCartao());
        System.out.println("Deposito: "+conta2.getDepositar());
        System.out.println("Saldo: "+conta2.getSaldo());
        System.out.println("Sacar: "+conta2.getSacar());
        System.out.println("Taxa: "+conta2.getTaxa());
    
    
    
    }
    
    
    
}
