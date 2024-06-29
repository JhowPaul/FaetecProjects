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
public class Livros {
String titulo;
String autor;
String editora;
boolean emprestimo;

    
int ano;
int edicao;
int numFolhas;
public Livros(){}
    public Livros(String titulo, String autor, String editora, int ano, int edicao, int numFolhas,boolean emprestimo) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numFolhas = numFolhas;
        this.emprestimo=emprestimo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumFolhas() {
        return numFolhas;
    }

    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }
  public boolean isEmprestimo() {
        return this.emprestimo;
  }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
  public void abrirLivro(){
      System.out.println("Livro esta aberto");
  }
  public void fechaLivro(){
      System.out.println("Livro esta fechado");
  }
  
}
