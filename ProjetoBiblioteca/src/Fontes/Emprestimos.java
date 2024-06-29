/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fontes;

/**
 *
 * @author aluno
 */
public class Emprestimos {

    String dataEmprestimo;
    String horaEmprestimo;
    
    Usuarios usuarios;
    Livros livreto;

    public String getDataEmprestimo() {
        return dataEmprestimo;
        
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    
    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Livros getLivreto() {
        return livreto;
    }

    public void setLivreto(Livros livreto) {
        this.livreto = livreto;
    }

   

    public void devolverLivro() {
        
        livreto.setEmprestimo(true);
        System.out.println("Livro devolvido");

    }

    public Emprestimos() {

    }

    public Emprestimos(String dataEmprestimo, String horaEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        
       
    }

}
