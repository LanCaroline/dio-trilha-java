public class Banco {

    private String nome;

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fulano", "485632156-22");
        Cliente cliente3 = new Cliente("alguém", "951752156-14");

        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca cp = new ContaPoupanca(cliente3);


        cc.depositar(100);
        cc.tranferir(cp, 100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println();
        System.out.println(cc.listarClientesContaCorrente());
        System.out.println(cp.listarClientesContaPoupanca());

    }
}
