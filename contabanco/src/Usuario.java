import java.util.Scanner;

public class Usuario {

    /*
     * Uso do Scanner
     *
     * String - nextLint();
     * Int - nextInt();
     * Float - nextFloat();
     * Double - nextDouble();
     * Boolean - nextBoolean();
     */

    public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nome = scan.nextLine();
        contaTerminal.setNomeCliente(nome);

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scan.nextLine();
        contaTerminal.setAgencia(agencia);

        System.out.println("Por favor, digite o número da conta: ");
        while(scan.hasNext()){
            if(scan.hasNextInt()){
                int conta = scan.nextInt();
                contaTerminal.setConta(conta);
                break;
            }else{
                System.out.println("Neste campo, digite apenas números.");
                scan.nextLine();
            }
        }

        System.out.println("Por favor, digite o valor de seu saldo: ");
        while(scan.hasNext()){
            if(scan.hasNextInt()){
                double saldo = scan.nextInt();
                contaTerminal.setSaldo(saldo);
                break;
            }else{
                System.out.println("Neste campo, digite apenas números.");
                scan.nextLine();
            }
        }



        System.out.println("Olá "+contaTerminal.getNomeCliente()+
                ", obrigado por criar uma conta em nosso banco, sua agência é "+contaTerminal.getAgencia()+
                ", conta "+contaTerminal.getConta()+
                ", e seu saldo "+contaTerminal.getSaldo()+
                " Já está disponível para saque.");

    }

}
