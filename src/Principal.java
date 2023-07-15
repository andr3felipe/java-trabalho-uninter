import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Dollar dollar = new Dollar(0);
        Euro euro = new Euro(0);
        Real real = new Real(0);
        Scanner userInput = new Scanner(System.in);

        while(true) {
            System.out.println("\nMenu:\n1- Adicionar moeda;\n2- Remover moeda;\n3- Listar moedas;\n4- Total convertido para real;\n5- Encerrar;\n");
            int choice = userInput.nextInt();

            if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
                System.out.println("Opção inválida.\n");
            }
            switch (choice) {
                case 1:
                    while(true) {
                        System.out.println("Qual moeda deseja adicionar ?\n1- Real;\n2- Dolar;\n3- Euro;\n");
                        int typeOfCoin = userInput.nextInt();

                        if (typeOfCoin != 1 && typeOfCoin != 2 && typeOfCoin != 3) {
                            System.out.println("Opção inválida.\n");
                        } else {
                            System.out.println("Qual a quantidade ?\n");
                            double amountOfCoins = userInput.nextDouble();

                            switch (typeOfCoin) {
                                case 1 -> {
                                    real.set(amountOfCoins);
                                    cofrinho.adicionar(real);
                                }
                                case 2 -> {
                                    dollar.set(amountOfCoins);
                                    cofrinho.adicionar(dollar);
                                }
                                case 3 -> {
                                    euro.set(amountOfCoins);
                                    cofrinho.adicionar(euro);
                                }
                                default -> System.out.println("Opção inválida.");
                            }
                            break;
                        }

                    }
                    break;
                case 2:
                    System.out.println("Qual moeda deseja remover ?\n1- Real\n2- Dolar\n3- Euro\n");
                    int typeOfCoin = userInput.nextInt();

                    switch (typeOfCoin) {
                        case 1 -> cofrinho.remover(real);

                        case 2 -> cofrinho.remover(dollar);

                        case 3 -> cofrinho.remover(euro);

                        default -> System.out.println("Opção inválida.");
                    }
                break;

                case 3:
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    cofrinho.totalConvertido();
                    break;
                case 5:
                    break;
            }

            if(choice == 5){
                System.out.println("Encerrando...");
                break;
            }
        }
    }
}