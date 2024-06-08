import java.util.ArrayList;
import java.util.List;

public class ContaCorrente  extends Conta{

    private List<Cliente> ccList = new ArrayList<>();
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        ccList.add(cliente);
    }



    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente===");
        super.imprimirExtrato();

    }

    public String listarClientesContaCorrente() {

        if (!ccList.isEmpty()) {
            for (Cliente cliente : ccList) {
                return "==============Lista de Clientes Conta Corrente==============\n"+
                        "Cliente: "+cliente.getNome()+" \n"+ cliente.getCpf();
            }
        } else {
            throw new IllegalArgumentException("Lista de clientes com conta corrente vazia.");
        }
        return null;
    }


}
