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
public class Livros {
    String titulos;
    String autores;
    String area;
    String editora;
    int ano;
    int numeroFolhas;
    boolean emprestimo;

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroFolhas() {
        return numeroFolhas;
    }

    public void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }
    public boolean isEmprestimo(){
        return this.emprestimo;
    }
    public void setEmprestimo(boolean emprestimo){
        
        
        this.emprestimo = emprestimo;
    }
    
    public void abrirLivro(){
        System.out.println("Livro Aberto");
        
    }
    public void fecharLivro(){
        System.out.println("Livro Fechado");
        
    }
    public Livros(){
    
}

    public Livros(String titulos, String autores, String area, String editora, int ano, int numeroFolhas,boolean emprestimo) {
        this.titulos = titulos;
        this.autores = autores;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.numeroFolhas = numeroFolhas;
        this.emprestimo = emprestimo;
    }
    
}
