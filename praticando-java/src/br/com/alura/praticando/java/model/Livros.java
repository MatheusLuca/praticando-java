package br.com.alura.praticando.java.model;

import java.util.ArrayList;

public class Livros {

    private String titulo;
    private String autor;
    private int paginas;
    private ArrayList<Livros> livro = new ArrayList<>();

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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    public void adicionarLivros(Livros livrosRecebidos){
        this.livro.add(livrosRecebidos);
    }

    public String imprimirLivros(){
        for(Livros livros: livro ){
            System.out.println(livros.getTitulo());
        }
    }




}
