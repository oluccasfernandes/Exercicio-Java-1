import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a porcentagem do IPI
        System.out.print("Digite a porcentagem do IPI a ser acrescido (%): ");
        double ipiPercentual = scanner.nextDouble();

        // Ler os detalhes da primeira peça
        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças 1: ");
        int quantidadePeca1 = scanner.nextInt();

        // Ler os detalhes da segunda peça
        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitarioPeca2 = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        int quantidadePeca2 = scanner.nextInt();

        // Calcular o valor total da primeira peça
        double totalPeca1 = valorUnitarioPeca1 * quantidadePeca1;

        // Calcular o valor total da segunda peça
        double totalPeca2 = valorUnitarioPeca2 * quantidadePeca2;

        // Calcular o valor total sem IPI
        double totalSemIPI = totalPeca1 + totalPeca2;

        // Calcular o valor total com IPI
        double totalComIPI = totalSemIPI * (1 + ipiPercentual / 100);

        // Apresentar o resultado
        System.out.println("Valor total a ser pago (com IPI): R$ " + totalComIPI);
    }
}
