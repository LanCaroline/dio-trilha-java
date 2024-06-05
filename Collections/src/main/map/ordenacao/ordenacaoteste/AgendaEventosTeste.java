package main.map.ordenacao.ordenacaoteste;

import main.map.ordenacao.agendadeeventos.AgendaEventos;

import java.time.LocalDate;

public class AgendaEventosTeste {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024,6,20), "Festa Junina", "Banda de Sertanejo");
        agenda.adicionarEvento(LocalDate.of(2024,12,25), "Natal", "Carol Of The Bells by Libera");
        agenda.adicionarEvento(LocalDate.of(2024,9,21), "Oktoberfest", "Augustiner Festzelt, Armbrustschützenzelt, Hacker-Festzelt");
        agenda.adicionarEvento(LocalDate.of(2025,3,27), "Web Summit Rio", "Fábio Coelho");

        System.out.println(agenda.exibirAgenda());
        System.out.println(agenda.obterProximoEvento());


    }
}
