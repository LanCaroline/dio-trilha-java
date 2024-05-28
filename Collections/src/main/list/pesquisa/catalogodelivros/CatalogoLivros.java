package main.list.pesquisa.catalogodelivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros(){
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public ArrayList pesquisarPorAutor(String autor){

        ArrayList<Livro> livrosPorAutor = new ArrayList<>();

        if (!livros.isEmpty()){
            for(Livro livro : livros){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
            return livrosPorAutor;

        }

        return null;

    }

    public ArrayList pesquisarPorintervaloAnos(int anoInicial, int anoFinal){

        ArrayList<Livro> livrosIntervaloAno = new ArrayList<>();

        if (!livros.isEmpty()){
            for(Livro livro : livros){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosIntervaloAno.add(livro);
                }
            }

            return livrosIntervaloAno;

        }

        return null;
    }

    public Livro pesquisarPorTitulo(String titulo){

        if (!livros.isEmpty()){
            for(Livro livro : livros){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    return livro;
                }
            }

        }

        return null;

    }


}
