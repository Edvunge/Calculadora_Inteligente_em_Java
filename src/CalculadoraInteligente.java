import java.util.Locale;
import java.util.Scanner;

public class CalculadoraInteligente {
    public static void main(String[] args) {

        /*
Exercício de Java
Calculadora inteligente

1. Adição
2. Subtração
3. Multiplicação
4. Divisão
5. Módulo de um número
6. Sucessor & antecessor
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

        System.out.println(" Digite qual a operação que deseja: adicao, subtracao, multiplicacao e o divisao.");
        final String Opercao = input.next();

        System.out.println("indique um outro numero inteiro?");
        int segundoNumero = input.nextInt();

        int soma = primeiroNumero + segundoNumero;
        int subtraccao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

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
            default:
                System.out.println("numero invalido, !!ESTA OPERAÇÃO NÃO EXISTE!!!");
        }

        input.close();
    }
}
