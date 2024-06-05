package main.map.ordenacao.agendadeeventos;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> agenda;

    public AgendaEventos(){
        agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agenda.put(data, new Evento(nome, atracao));
    }

    public Map<LocalDate, Evento> exibirAgenda(){
        Map<LocalDate, Evento> agendaOrganizada = new TreeMap<>(agenda);
        if(!agenda.isEmpty()){
            return agendaOrganizada;
        }else {
            throw new IllegalArgumentException("Agenda vazia.");
        }
    }

    public Evento obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento = null;
        if(!agenda.isEmpty()){
            for(LocalDate d : agenda.keySet()){
                if(dataAtual.equals(d) || dataAtual.isBefore(d)){
                    proximoEvento = new Evento(agenda.get(d).getNome(), agenda.get(d).getAtracao());
                }
            }
        }else {
            throw new IllegalArgumentException("Agenda vazia.");
        }

        return proximoEvento;
    }



}
