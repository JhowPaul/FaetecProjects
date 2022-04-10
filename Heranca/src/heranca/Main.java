
package heranca;


public class Main {
    
    
    public static void main(String[] args) {
        Automovel carro=new Automovel();
        Automovel moto=new Automovel();
        
        carro.setNumPlaca("ggg-0000");
        carro.setNumPortas(4);
        carro.setCapacidade(5);
        carro.setNumRodas(4);
        
        moto.setNumPlaca("aaa-1111");
        moto.setNumPortas(0);
        moto.setCapacidade(2);
        moto.setNumRodas(2);
        
        System.out.println("Numero da placa: "+carro.getNumPlaca());
        System.out.println("Numero da portas: "+carro.getNumPortas());
        System.out.println("Numero da rodas: "+carro.getNumRodas());
        System.out.println("Numero da Capacidade: "+carro.getCapacidade());
        
    }
    
}
