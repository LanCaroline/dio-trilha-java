package main.list.pesquisa.pesquisateste;

import main.list.pesquisa.catalogodelivros.CatalogoLivros;
import main.list.pesquisa.catalogodelivros.Livro;

public class CatalogoLivrosTeste {

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro(new Livro("Nos passos de Jesus", "Edir Macedo", 2020));
        catalogoLivros.adicionarLivro(new Livro("Crash", "Alexandre Versignassi", 2015));
        catalogoLivros.adicionarLivro(new Livro("Amor Líquido", "Zygmunt Bauman", 2004));
        catalogoLivros.adicionarLivro(new Livro("O Último Teorema de Fermat", "Simon Singh", 1997));
        catalogoLivros.adicionarLivro(new Livro("O Livro dos Códigos", "Simon Singh", 1999));

        System.out.println("Pesquisar por autor: ");
        System.out.println(catalogoLivros.pesquisarPorAutor("Alexandre Versignassi"));

        System.out.println("Pesquisar por intervalo de ano: ");
        System.out.println(catalogoLivros.pesquisarPorintervaloAnos(1997, 2005));

        System.out.println("Pesquisar por autor: ");
        System.out.println(catalogoLivros.pesquisarPorAutor("Simon Singh"));


        System.out.println("Pesquisar por título: ");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Crash"));


    }
}
