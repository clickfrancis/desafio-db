import java.util.Scanner;

public class DesafioDois{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            if (idade >= 0) {
                String resultado = verificarIdade(idade);
                System.out.println(resultado);
            } else {
                System.out.println("A idade não pode ser negativa.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, digite apenas caracteres do tipo número.");
        }
    }

    public static String verificarIdade(int idade) {
        if (idade >= 18) {
            return "A pessoa é maior de idade.";
        } else {
            return "A pesssoa é menor de idade.";
        }
    }
}
