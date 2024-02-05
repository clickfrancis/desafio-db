import java.util.Random;

public class DesafioQuatro {
    public static void main(String[] args) {
        Random random = new Random();

        int menorNumero = 100;
        int maiorNumero = 0;

        System.out.print("Os 10 números aleatórios: ");
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(101);
            System.out.print(numero + " ");

            if (numero < menorNumero) {
                menorNumero = numero;
            }
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("\nO menor número da lista: " + menorNumero);
        System.out.println("O maior número da lista: " + maiorNumero);
    }
}
