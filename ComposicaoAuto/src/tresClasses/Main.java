
package tresClasses;


public class Main {

    public static void main(String[] args) {
        Carro carro=new Carro();
        Direcao direcao=new Direcao();
        Motor motor=new Motor();
        
        carro.direcao.setCor("branco");
        carro.direcao.setTamanhoRaio(0);
        carro.direcao.setKitMultimidia(true);
        carro.imprimir();
        
        System.out.println("Cor: "+carro.direcao.getCor());
        System.out.println("tamanho raio: "+carro.direcao.getTamanhoRaio());
        
        
    }
    
}
