package br.com.alura.praticando.java.view;

import br.com.alura.praticando.java.model.Livros;
import br.com.alura.praticando.java.model.Produto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: " +
                "1) Relatório produtos" +
                "2) Imprimindo resumo do livro" +
                "3)" +
                "4)" +
                "5)" +
                "6)" +
                "7)"+
                "8)"+
                "9)"+
                "10)");
        System.out.println("Escolha um exercicio da o menu: ");
        int escolhaExercicio = sc.nextInt();
        sc.nextLine();
        switch (escolhaExercicio){
            case 1:
                ArrayList<Produto> produtos = new ArrayList<>();
                System.out.println("Quantos produtos voce gostaria de cadastrar? ");
                int quantidadeProduto = sc.nextInt();
                sc.nextLine();

                for(int i = 1; i <= quantidadeProduto; i++){
                    System.out.println("Nome: ");
                    String produtoNome = sc.nextLine();
                    System.out.println("Preço: ");
                    double produtoPreco = sc.nextDouble();
                    System.out.println("Quantidade: ");
                    int produtoQuantidade = sc.nextInt();
                    Produto produto = new Produto();
                    produto.setNome(produtoNome);
                    produto.setPreco(produtoPreco);
                    produto.setQuantidade(produtoQuantidade);
                    produtos.add(produto);
                    sc.nextLine();
                }
                for (Produto p1 : produtos){
                    System.out.println(p1.toString());
                }
                break;
            case 2:
                    int inserirMaislivros = 0;
                    while(inserirMaislivros != 1 ){
                        System.out.println("Insira o titulo: ");
                        String livroTitulo = sc.nextLine();
                        System.out.println("Insira o autor: ");
                        String livroAutor = sc.nextLine();
                        System.out.println("Insira a quantidade de paginas: ");
                        int livroPaginas = sc.nextInt();
                        Livros livro = new Livros();
                        livro.setAutor(livroAutor);
                        livro.setPaginas(livroPaginas);
                        livro.setTitulo(livroTitulo);
                        livro.adicionarLivros(livro);
                        System.out.println("Digite 0 para incluir mais livros ou 1 para sair: ");
                        inserirMaislivros = sc.nextInt();
                        sc.nextLine();
                    }



                break;
        }


    }
}