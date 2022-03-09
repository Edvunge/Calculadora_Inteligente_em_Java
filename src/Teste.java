import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
/*
        System.out.println("indique um numero inteiro?");
        int numberOne = input.nextInt();

        System.out.println(" digite uma operaçao adição ,subtração, multiplicação, divisão.");
        String numeroOperacao = input.next();

        System.out.println(numeroOperacao);
        */

        // 6. Sucessor & antecessor de um numero

        System.out.println("indique um numero inteiro?");
        int number1 = input.nextInt();

        System.out.println("indique um numero inteiro?");
        int number2 = input.nextInt();

        int antecessor1 = number1 - 1;
        int sucessor1 = number1 + 1;

        int antecessor2 = number2 - 1;
        int sucessor2 = number2 + 1;

        System.out.printf("o seu antecessor do %s é: %s ", number1 , antecessor1);
        System.out.printf(" %n o seu sucessor do %s é: %s " ,number1 , sucessor1);

        System.out.printf(" %n o seu antecessor do %s é: %s ", number2 , antecessor2);
        System.out.printf(" %n o seu sucessor do %s é: %s " ,number2 , sucessor2);

        /* switch () {
            case "preta":
                System.out.println(" ");
                break;
            default:
                System.out.println("nao sei nada!");
        }
*/


        input.close();
    }
}
