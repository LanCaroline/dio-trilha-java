import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = 0;
        boolean continuar = true;

        do{
            if(terminal.hasNextInt()) {
                parametroUm = terminal.nextInt();
                continuar =false;
            }else {
                System.out.println("Digite apenas números.");
                terminal.nextLine();
            }
        }
        while(continuar);


        System.out.println("Digite o segundo parâmetro");
        int parametroDois = 0;
        continuar = true;

        do{
            if(terminal.hasNextInt()) {
                parametroDois = terminal.nextInt();
                continuar = false;
            }else {
                System.out.println("Digite apenas números.");
                terminal.nextLine();
            }
        }
        while(continuar);

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());

        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroDois<parametroUm){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i <= contagem; i++){
            System.out.println("Nº"+i);
        }

    }

}
