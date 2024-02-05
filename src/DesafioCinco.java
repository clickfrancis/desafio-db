import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DesafioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int jogador = 0;

        while(true) {
            try {
                System.out.println("\nFaça sua jogada: \n1 - Pedra\n2 - Papel \n3 - Tesoura \n4 - Sair do jogo");
                jogador = scanner.nextInt();


            }catch (InputMismatchException e){
                System.out.println("\nOpção inválida! Por favor, escolha uma opção válida.\n");
                scanner.next();
                break;
            }

                if (jogador < 1 || jogador > 4) {
                    System.out.println("\nOpção inválida! Por favor, escolha uma opção válida.\n");
                    break;
                }

                if (jogador == 4) {
                    System.out.println("\nFinalizando do jogo...\n");
                }

                int maquina = random.nextInt(3) + 1;
                System.out.println("\nVocê escolheu: " + jogada(jogador));
                System.out.println("A máquina escolheu: " + jogada(maquina) + "\n");

                int resultado = resultado(jogador, maquina);
                if (resultado == 0) {
                    System.out.println("Empate!");
                } else if (resultado == 1) {
                    System.out.println("Você ganhou!");
                } else {
                    System.out.println("Você perdeu!");
                }


        }
        scanner.close();
    }

    public static String jogada(int opcao) {
        switch (opcao) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Opção inválida";
        }
    }

    public static int resultado(int jogador, int maquina) {
        if (jogador == maquina) {
            return 0;
        } else if ((jogador == 1 && maquina == 3) ||
                (jogador == 2 && maquina == 1) ||
                (jogador == 3 && maquina == 2)) {
            return 1;
        } else {
            return -1;
        }
    }
}
