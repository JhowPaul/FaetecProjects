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
public class UsaBiblioteca {
    public static void main(String[] args) {
        Livros livros = new Livros();
        Livros outroLivro = new Livros("O céu noturno em minha mente","Sarah Hammond","infantojuvenil","Galeria Record", 2016, 288,false);
        
        livros.setTitulos("A volta dos que não foram");
        livros.setAutores("Felipe Pena");
        livros.setArea("adaptação de tese de mestrado");
        livros.setEditora("Sette letras");
        livros.setAno(1998);
        livros.setNumeroFolhas(200);
        livros.emprestimo=false;
        
        Usuarios usuarios = new Usuarios();
        Usuarios outroUsuario = new Usuarios("Baki Hanma", 18,"M","8888-5555");
        
        usuarios.setNome("Steven Wilson");
        usuarios.setIdade(21);
        usuarios.setSexo("M");
        usuarios.setTelefone("219999-8888");
        
        Emprestimos emprestimos = new Emprestimos();
        Emprestimos outroEmprestimo = new Emprestimos("15/01/2022","16:00");
        
        emprestimos.setDataEmprestimo("22/02/2022");
        emprestimos.setHoraEmprestimo("10:00AM");
        emprestimos.setLivreto(livros);
        emprestimos.setUsuarios(usuarios);
        
        
        
        outroEmprestimo.setDataEmprestimo("12/06/92");
        outroEmprestimo.setHoraEmprestimo("06:12PM");
        outroEmprestimo.setLivreto(outroLivro);
        outroEmprestimo.setUsuarios(outroUsuario);
        
        
        System.out.println("       ----Empréstimos----");
        
        System.out.println("Quem pegou livro emprestado?: "+emprestimos.getUsuarios().getNome());
        System.out.println("Em que dia foi emprestado?: "+emprestimos.getDataEmprestimo());
        System.out.println("Em que horas foi emprestado?: "+emprestimos.getHoraEmprestimo());
        System.out.println("Qual livro foi emprestado?: "+emprestimos.getLivreto().getTitulos());
        
        System.out.println("");
        
        emprestimos.livreto.abrirLivro();
        emprestimos.usuarios.lerLivro();
        emprestimos.livreto.fecharLivro();
        emprestimos.devolverLivro();
        
        System.out.println("");
        
        System.out.println("Quem pegou livro emprestado?: "+outroEmprestimo.getUsuarios().getNome());
        System.out.println("Em que dia foi emprestado?: "+outroEmprestimo.getDataEmprestimo());
        System.out.println("Em que horas foi emprestado?: "+outroEmprestimo.getHoraEmprestimo());
        System.out.println("Qual livro foi emprestado?: "+outroEmprestimo.getLivreto().getTitulos());
        
        System.out.println("");
        
        outroEmprestimo.livreto.abrirLivro();
        outroEmprestimo.usuarios.lerLivro();
        outroEmprestimo.livreto.fecharLivro();
        outroEmprestimo.devolverLivro();
        
        
        
    }
}
