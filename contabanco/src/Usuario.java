import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {

        dadosParaCadastro();
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Olá "+contaTerminal.getNomeCliente()+
                ", obrigado por criar uma conta em nosso banco, sua agência é "+contaTerminal.getAgencia()+
                ", conta "+contaTerminal.getConta()+
                ", e seu saldo "+contaTerminal.getSaldo()+
                " Já está disponível para saque.");

    }

    public static void dadosParaCadastro(){

        int conta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        System.out.println("================== Bem-Vindo ao seu Banco ==================");

        int i = 5;
        while(i!=0){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Menu: \n"+
                    "[1] - Número da conta. \n"+
                    "[2] - Número da agência. \n"+
                    "[3] - Nome Completo. \n"+
                    "[4] - Valor do saldo. \n"+
                    "[0] - Sair. \n"+
                    "================== Bem-Vindo ao seu Banco ==================");

            if(scanner.toString().equals("1")){
                System.out.println("Digite o número da conta: ");
                String numero = scanner.toString();
                conta = Integer.parseInt(numero);
                i++;
            }
            if (scanner.toString().equals("2")){
                System.out.println("Digite o número da agência: ");
                agencia = scanner.toString();
                i++;
            }
            if (scanner.toString().equals("3")){
                System.out.println("Digite seu nome completo: ");
                nomeCliente = scanner.toString();
                i++;
            }
            if (scanner.toString().equals("4")){
                System.out.println("Digite o valor do saldo: ");
                String numero = scanner.toString();
                saldo = Double.parseDouble(numero);
                i++;
            }

            ContaTerminal contaTerminal = new ContaTerminal(conta, agencia, nomeCliente,saldo);

            if (scanner.toString().equals("0")){
                i = 0;
            }
        }
    }

}
