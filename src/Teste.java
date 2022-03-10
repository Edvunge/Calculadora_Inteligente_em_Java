import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* switch () {
            case "preta":
                System.out.println(" ");
                break;
            default:
                System.out.println("nao sei nada!");
        }
*/
        /*

        a) primeiroNumero
        b) segundoNumero
        c) terceiroNumero

        Fórmula de Bhaskara

        XISum = ( ( ( - B ) + SQRT(DELTA) ) / 2 (A) )
        XISdois = ( ( ( - B ) - SQRT(DELTA) ) / 2 (A) )

          Fórmula de DELTA

          DELTA = ( ( B * B ) - ( (4) * (A) * (C) ) )

          */

        System.out.println("indique um numero inteiro?");
        int primeiroNumero = input.nextInt();

        System.out.println("indique um outro numero inteiro?");
        int segundoNumero = input.nextInt();

        System.out.println("indique o terceiro numero inteiro?");
        int terceiroNumero = input.nextInt();

        /*
        Se o valor encontrado para delta for negativo,
        não precisa fazer mais nenhum cálculo e a resposta será que a equação não possui raízes reais.

        Caso o valor do delta seja igual ou maior que zero,
        devemos substituir todas as letras pelos seus valores na fórmula de Bhaskara e calcular as raízes.

        */

        // Fórmula de DELTA
        int formulaDeDelta = ( ( segundoNumero * segundoNumero ) - ( (4) * (primeiroNumero) * (terceiroNumero) ) );



        if(primeiroNumero!=0){

            if (formulaDeDelta >= 0 ) {

                // Fórmula de Bhaskara
                double xisUm = ( ( ( - segundoNumero ) + Math.sqrt(formulaDeDelta) ) / ( (2) * (primeiroNumero) ) );
                double xisDois = ( ( ( - segundoNumero ) - Math.sqrt(formulaDeDelta) ) / ( (2) * (primeiroNumero) ) );

                System.out.printf(" Assim, as raízes da equação %s x2 %s x %s = 0 são x1 = %s e x2 = %s " , primeiroNumero , segundoNumero , terceiroNumero ,xisUm ,xisDois );

            }
        else
            System.out.println(" a equação não possui raízes reais ");
    }


        input.close();
    }
}
