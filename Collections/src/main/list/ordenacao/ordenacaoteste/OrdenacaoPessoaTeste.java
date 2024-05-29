package main.list.ordenacao.ordenacaoteste;

import main.list.ordenacao.ordenacaodepessoas.OrdenacaoPessoas;

public class OrdenacaoPessoaTeste {

    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nicolas", 20, 1.86);
        ordenacaoPessoas.adicionarPessoa("Arthur", 30, 1.90);
        ordenacaoPessoas.adicionarPessoa("Marina", 25, 1.76);
        ordenacaoPessoas.adicionarPessoa("Augusto", 17, 1.78);
        ordenacaoPessoas.adicionarPessoa("Aghata", 22, 1.65);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
