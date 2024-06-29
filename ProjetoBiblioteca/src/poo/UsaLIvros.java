/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author professor
 */
public class UsaLIvros {
    public static void main(String[] args) {
        Livros livros = new Livros("POO","Thiago Leite","Alura",2016,2018,254,false);
        Usuarios usa = new Usuarios("Claudia",45,'F',"94588622");
        Emprestimo emp = new Emprestimo("07/02/2022","08:30");
    
       emp.setUsuario(usa);
       emp.setLiv(livros);
       
        
        System.out.println("Data emprestimo = "+ emp.getDataEmp());
        System.out.println("Hora emprestimo = "+ emp.getHoraEmp());
        System.out.println("Usuário = "+ emp.getUsuario().getNome());
        System.out.println("Livro =  "+ emp.getLiv().getTitulo()+"  Autor = "+emp.liv.getAutor());
        
        emp.liv.abrirLivro();
        emp.usuario.lerLivro();
        emp.liv.fechaLivro();
        emp.devolverLivro();
    }
}
