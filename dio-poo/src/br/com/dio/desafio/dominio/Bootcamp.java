package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private String nome;

    private String descricao;

    private final LocalDate DATA_INICIAL = LocalDate.now();

    private final LocalDate DATA_FINAL = DATA_INICIAL.plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();

    private Set<Conteudo> conteudos = new LinkedHashSet<>();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDATA_INICIAL() {
        return DATA_INICIAL;
    }

    public LocalDate getDATA_FINAL() {
        return DATA_FINAL;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }


    public void removerConteudo(Conteudo conteudo) {
        Optional<Conteudo> remover = this.conteudos.stream()
                .filter(conteudo1 -> conteudo1.equals(conteudo))
                .findFirst();

        if (remover.isPresent()) {
            this.conteudos.remove(remover.get());
            System.out.println("Bootcamp removido com sucesso.");
        } else {
            System.out.println("Bootcamp não encontrado.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDATA_INICIAL(), bootcamp.getDATA_INICIAL()) && Objects.equals(getDATA_FINAL(), bootcamp.getDATA_FINAL()) && Objects.equals(getDevsInscritos(), bootcamp.getDevsInscritos()) && Objects.equals(getConteudos(), bootcamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDATA_INICIAL(), getDATA_FINAL(), getDevsInscritos(), getConteudos());
    }
}
