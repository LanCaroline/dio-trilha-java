package main.map.ordenacao.ordenacaoteste;

import main.map.ordenacao.livrariaonline.LivrariaOnline;
import main.map.ordenacao.livrariaonline.Livro;

public class LivrariaOnlineTeste {

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://acesse.one/Av791", "The Death of Ivan Ilyich and Other Stories (Vintage Classics)", "Leo Tolstoy", 15.99);
        livraria.adicionarLivro("https://acesse.one/UH9Uk", "Crime and Punishment (Vintage Classics)", "Fyodor Dostoevsky", 13.96);
        livraria.adicionarLivro("https://l1nk.dev/z2I8B", "The Brothers Karamazov (Bicentennial Edition)", "Fyodor Dostoevsky", 13.29);
        livraria.adicionarLivro("https://acesse.one/a0vCr","Chopin: Etudes (Multilingual Edition)", "Frédéric Chopin", 30.95);

        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());
        System.out.println("Livro mais caro: "+livraria.obterLivroMaisCaro());
        System.out.println("Livro mais barato: "+livraria.obterLivroMaisBarato());
        System.out.println("Livros do autor: "+livraria.pesquisarLivroPorAutor("Dostoevsky"));
        System.out.println("Livros do autor: "+livraria.pesquisarLivroPorAutor("Leo"));
    }

}
