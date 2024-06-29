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
public class Emprestimo {
    String dataEmp;
    String horaEmp;
    Usuarios usuario;
    Livros liv;
    
   public Emprestimo(){}
    public Emprestimo(String dataEmp, String horaEmp) {
        this.dataEmp = dataEmp;
        this.horaEmp = horaEmp;
        
    }
  
    public String getDataEmp() {
        return dataEmp;
    }

    public void setDataEmp(String dataEmp) {
        this.dataEmp = dataEmp;
    }

    public String getHoraEmp() {
        return horaEmp;
    }

    public void setHoraEmp(String horaEmp) {
        this.horaEmp = horaEmp;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Livros getLiv() {
        return liv;
    }

    public void setLiv(Livros liv) {
        this.liv = liv;
    }
    public void isEmprestimo(){
         
    }
    public void devolverLivro(){
      liv.setEmprestimo(true);
      System.out.println("Livro devolvido.");
  }
}
