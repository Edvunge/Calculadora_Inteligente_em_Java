import java.util.Locale;
import java.util.Scanner;

public class CalculadoraInteligente {
    public static void main(String[] args) {

        /*
Exercício de Java
Calculadora inteligente

7. Resolver eq.1 e 2 graus
8. Potência de um número
9. Raiz quadrada de um número
10. Par ou ímpar
11. Números primos
12. Tabuada
13. Fatorial de um número
14. Contagem crescente de 1 a 100
15. Contagem decrescente 100 & 1
16. Exponencial de um número
17. Radiciação
18. ..
19. ..
20. ..
        */

        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero inteiro?");
        int primeiroNumero = input.nextInt();

        System.out.println("indique um outro numero inteiro?");
        int segundoNumero = input.nextInt();

        System.out.println(" Digite qual a operação que deseja: adicao, subtracao, multiplicacao , divisao e o modulo.");
        System.out.println(" Digite qual a operação que deseja: sucessor , antecessor, equacao1");
        final String Opercao = input.next();

        int soma = primeiroNumero + segundoNumero;
        int subtraccao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;
        double modulo =  primeiroNumero % segundoNumero;

        switch (Opercao.toLowerCase()){
            case "adicao":
                System.out.printf("a soma entre %s + %s é =  %s " , primeiroNumero , segundoNumero ,soma);
                break;
            case "subtraccao":
                System.out.printf("a soma entre %s - %s é =  %s " , primeiroNumero , segundoNumero ,subtraccao);
                break;
            case "multiplicacao":
                System.out.printf("a soma entre %s * %s é =  %s " , primeiroNumero , segundoNumero ,multiplicacao);
                break;
            case "divisao":
                System.out.printf("a soma entre %s / %s é =  %s " , primeiroNumero , segundoNumero ,divisao);
                break;
            case "modulo":
                System.out.printf("a soma entre %s %% %s é =  %s " , primeiroNumero , segundoNumero ,modulo);
                break;
            case "antecessor":

                        System.out.println("Quer saber o antecessor do primeiro numero? ou segundo?");
                        String antecessor = input.next();

                            switch (antecessor.toLowerCase()) {
                                case "primeiro":
                                    int antecessorPrimeiroNumero = primeiroNumero - 1;
                                    System.out.printf("o seu antecessor do %s é: %s ", primeiroNumero , antecessorPrimeiroNumero);
                                    break;
                                case "segundo":
                                    int antecessorSegundoNumero = segundoNumero - 1;
                                    System.out.printf("o seu antecessor do %s é: %s ", segundoNumero , antecessorSegundoNumero);
                                    break;
                                default:
                                    System.out.println("DESCULPA! mas este texto é invalido.");
                            }
                break;

            case "sucessor":

                System.out.println("Quer saber o sucessor do primeiro numero? ou segundo?");
                String sucessor = input.next();

                switch (sucessor.toLowerCase()) {
                    case "primeiro":
                        int sucessorPrimeiroNumero = primeiroNumero + 1;
                        System.out.printf("o seu sucessor do %s é: %s ", primeiroNumero , sucessorPrimeiroNumero);
                        break;
                    case "segundo":
                        int sucessorSegundoNumero = segundoNumero + 1;
                        System.out.printf("o seu sucessor do %s é: %s ", segundoNumero , sucessorSegundoNumero);
                        break;
                    default:
                        System.out.println("DESCULPA! mas este texto é invalido.");
                }
                break;
            case "equacao1":

                    System.out.println("Equação do 1° grau é toda equação que pode ser expressa na forma ax+b=0, com ‘a’ diferente de zero ");

                    int valorDeXis = (  - ( segundoNumero / primeiroNumero) );

                    System.out.println("o resultado do calculo da equação do primeiro grau é: " + valorDeXis);

                break;
            default:
                System.out.println("numero invalido, !!ESTA OPERAÇÃO NÃO EXISTE!!!");
        }

        input.close();
    }
}