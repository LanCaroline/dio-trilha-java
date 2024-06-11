import br.com.dio.desafio.dominio.*;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de lógica de programação em Java, programação orientada a objeto e estrutura de dados com Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de lógica de programação em Python, programação orientada a objeto e estrutura de dados com Python.");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tire dúvidas e fale sobre Java");
        mentoria.setData(LocalDate.of(2024,8,23));


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println("=================");

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desenvolvendo com Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso2);
        System.out.println(bootcamp.getConteudos());
        bootcamp.removerConteudo(curso2);
        System.out.println(bootcamp.getConteudos());


        Dev fulano = new Dev();

        fulano.setNome("Fulano Pessoa");
        fulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscridos de Fulano: "+fulano.getConteudosInscritos());
        fulano.progredir();
        fulano.getConteudosConcluidos().add(curso1);
        System.out.println("Conteúdos concluídos de Fulano: "+fulano.getConteudosConcluidos());
        System.out.println(fulano.calcularTotalXP());
        System.out.println("Número de conteúdos inscritos por fulano: "+ fulano.bootcampsIncritos());


        Dev alguem = new Dev();

        alguem.setNome("Alguém Alien");
        alguem.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscridos de Alguém: "+fulano.getConteudosInscritos());
        alguem.progredir();
        System.out.println("Conteúdos concluídos de Alguém: "+alguem.getConteudosConcluidos());

        System.out.println("Número de conteúdos inscritos por alguém: "+ alguem.bootcampsIncritos());

    }


}
