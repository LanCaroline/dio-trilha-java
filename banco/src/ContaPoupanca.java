import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta {

    private List<Cliente> cpList = new ArrayList<>();
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        cpList.add(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança===");
        super.imprimirExtrato();

    }

    public String listarClientesContaPoupanca() {

        if (!cpList.isEmpty()) {
            for (Cliente cliente : cpList) {
                return "==============Lista de Clientes Conta Poupança==============\n"+
                        "Cliente: "+cliente.getNome()+" \n"+ cliente.getCpf();
            }
        } else {
            throw new IllegalArgumentException("Lista de clientes com conta corrente vazia.");
        }
        return null;
    }

}
