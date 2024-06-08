
public abstract class Conta {

    protected static final int AGENCIA = 1;
    protected static int SEQUENCIAL = 0;
    private static double VALOR_MENOR_ZERO = Double.MIN_NORMAL;
    private static double VALOR_MINIMO = Double.MIN_VALUE;

    protected int agencia;
    protected int conta;
    protected double saldo;


    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        agencia = AGENCIA;
        conta = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(this.saldo !=0 && this.saldo >= valor && valor != VALOR_MENOR_ZERO) {
            this.saldo -= valor;
        }else {
            System.out.println("Valor inválido.");
        }
    }

    public void depositar(double valor){
        if(valor > VALOR_MINIMO) {
            this.saldo += valor;
        }else {
            System.out.println("Valor inválido.");
        }
    }

    public void tranferir(Conta contaDestino, double valor){
        if(this.saldo > VALOR_MENOR_ZERO && this.saldo >= valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    protected void imprimirExtrato(){
        System.out.println(String.format("Agencia: %d",this.agencia)+". \n"+
                String.format("Conta: %d",this.conta)+". \n"+
                String.format("Titular: %s", cliente.getNome())+". \n"+
                String.format("CPF: %s", cliente.getCpf())+". \n"+
                String.format("Saldo: %.2f", this.saldo)+". ");
    }


}
