import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero inteiro?");
        int numberOne = input.nextInt();

        System.out.println(" digite uma operaçao adição ,subtração, multiplicação, divisão.");
        String numeroOperacao = input.next();

        System.out.println(numeroOperacao);


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
