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
6. Tabuada
7. Fatorial de um número
8. Sucessor & antecessor
9. Números primos
10. Contagem crescente de 1 a 100
11. Contagem decrescente 100 & 1
12. Raiz quadrada de um número
13. Resolver eq.1 e 2 graus
14. Potência de um número
15. Exponencial de um número
16. Radiciação
17. Par ou ímpar
18. ..
19. ..
20. ..
        */

        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero inteiro?");
        int numberOne = input.nextInt();

        System.out.println("o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.");
        int numeroOperacao = input.nextInt();

        System.out.println("indique um outro numero inteiro?");
        int numberTwo = input.nextInt();

        int soma = numberOne + numberTwo;
        int sub = numberOne - numberTwo;
        int mult = numberOne * numberTwo;
        int div = numberOne / numberTwo;

        if (numeroOperacao == 1){
            System.out.printf("a soma entre %s e %s é =  %s " , numberOne , numberTwo ,soma);
        } else if (numeroOperacao == 2){
            System.out.printf("a subtracção entre %s e %s é =  %s " , numberOne , numberTwo ,sub);
        } else if (numeroOperacao == 3){
            System.out.printf("a multiplicação entre %s e %s é =  %s " , numberOne , numberTwo ,mult);
        } else if (numeroOperacao == 4){
            System.out.printf("a divisão entre %s e %s é =  %s " , numberOne , numberTwo ,div);
        } else {
            System.out.println("numero invalido, !!ESTA OPERAÇÃO NÃO EXISTE!!!");
        }

        input.close();
    }
}
