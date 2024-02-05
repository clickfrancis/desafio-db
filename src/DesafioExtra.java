import java.util.Scanner;

public class DesafioExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Informe o preço do produto:");
        double precoProduto = scanner.nextDouble();

        System.out.println("Informe a quantidade de unidades compradas do produto:");
        int quantidade = scanner.nextInt();

        double valorTotal = calculadora(precoProduto, quantidade);

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor total a ser pago: R$" + valorTotal);
    }

    public static double calculadora(double precoUnitario, int quantidade) {
        double valorTotal = 0;

        if (quantidade <= 10) {
            valorTotal = precoUnitario * quantidade;
        } else if (quantidade <= 20) {
            valorTotal = precoUnitario * quantidade * 0.9;
        } else if (quantidade <= 50) {
            valorTotal = precoUnitario * quantidade * 0.8;
        } else {
            valorTotal = precoUnitario * quantidade * 0.75;
        }

        return valorTotal;
    }
}
