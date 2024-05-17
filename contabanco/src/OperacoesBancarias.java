import java.util.Scanner;

public class OperacoesBancarias {

    public static void main(String[] args) {

        double saldo = 0;
        double valor;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        boolean menu = true;

        while (menu) {

            // TODO: Implemente as condições necessárias para avaliar a opção escolhida:
            System.out.println("==================== Operações Bancárias ====================\n"+
                    "[1] - Depositar\n"+
                    "[2] - Sacar\n"+
                    "[3] - Consultar Saldo\n"+
                    "[0] - Encerrar Operações\n"+
                    "==================== Operações Bancárias ====================\n\n"+
                    "Selecione a opção desejada: ");

            Scanner scanner = new Scanner(System.in);
            String opcao = scanner.nextLine();

            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch(opcao){
                // opção depositar
                case "1":
                    System.out.println("=======================\n"+
                            "Digite o valor a ser depositado: ");

                    //validação de valor de entrada
                    try{
                        valor = scanner.nextDouble();
                        if(valor > 0) {
                            //chamada do metodo depositar
                            saldo = depositar(saldo, valor);
                        }else {
                            System.out.println("Digite apenas valores válidos.\n"+
                                    "=======================");
                        }
                    }catch (Exception e){
                        System.out.println("Digite apenas valores válidos.\n"+
                                "=======================");
                    }

                    // voltar ao menu
                    break;

                // opção sacar
                case "2":

                    System.out.println("=======================\n"+
                            "Digite o valor que deseja sacar: ");
                    // validação do valor a ser sacado
                    try{
                        valor = scanner.nextDouble();
                        if(valor <= saldo && valor > 0){
                            saldo = sacar(saldo, valor);
                        }else {
                            System.out.println("Digite apenas valores válidos.\n"+
                                    "=======================");
                        }
                    }catch (Exception e){
                        System.out.println("Digite apenas valores válidos.\n"+
                                "=======================");
                        scanner.nextLine();
                    }

                    break;

                // opção consultar saldo
                case "3":
                    consultarSaldo(saldo);
                    break;

                // opção de encerrar
                case "0":
                    menu = false;
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        }

    public static double depositar(double saldo, double valor){

        double saldoAtual;

        saldoAtual = valor + saldo;
        System.out.println("Deposito realizado com sucesso.\n"+
                "=======================\n");
        return saldoAtual;
    }

    public static double sacar(double saldo, double valor){
        double saldoAtual;
        saldoAtual = saldo - valor;
        System.out.println("Valor sacado com sucesso.\n");
        System.out.println("Saldo atual: $"
                +saldoAtual+"\n"+
                "=======================\n");
        return saldoAtual;
    }

    public static void consultarSaldo(double saldo){
        System.out.println("=======================\n"+
                "Saldo atual: $"+saldo+ "\n"+
                "=======================\n");
    }
}
