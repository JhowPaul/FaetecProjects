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
public class Usuarios {
    String nome;
    int idade;
    char sexo;
    String tel;
    
    public Usuarios(){}
    public Usuarios(String nome, int idade, char sexo, String tel) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public void lerLivro(){
      System.out.println("Usuario esta lendo livro");
  }
}
