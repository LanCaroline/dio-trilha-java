import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {

    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
