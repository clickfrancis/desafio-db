import java.util.Scanner;
import java.util.InputMismatchException;


public class DesafioTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número para calcular o resultado da tabuada: ");
            int numero = scanner.nextInt();

            if (numero > 0 ) {
                System.out.println("O resultado da tabuada de " + numero + ":");

                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            } else {
                System.out.println("Informe um número positivo maior que 0 para realizar a tabuada.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, digite apenas caracteres do tipo número.");
        }
        scanner.close();
    }
}
