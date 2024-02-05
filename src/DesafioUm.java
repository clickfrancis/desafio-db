import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioUm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        do {
            try {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite apenas caracteres do tipo número.");
                scanner.next();
            }
        } while (numero != 10);

        System.out.println("Você digitou 10. A aplicação será encerrada.");

        scanner.close();
    }
}
