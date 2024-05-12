import java.nio.channels.FileLock;

public class ContaTerminal {
    private int conta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(){}
    public ContaTerminal(int conta, String agencia, String nomeCliente, double saldo){
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getConta(){
        return conta;
    }
    public String getAgencia(){
        return agencia;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }

}
