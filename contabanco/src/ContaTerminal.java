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
    public void setConta(int conta){
        this.conta = conta;
    }
    public String getAgencia(){
        return agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
