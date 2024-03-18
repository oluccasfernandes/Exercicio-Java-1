import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de canetas compradas (N):");
        int N = scanner.nextInt();

        System.out.println("Digite o valor da nota (Z) em reais:");
        double Z = scanner.nextDouble();

        System.out.println("Digite o valor do troco (Y) em reais:");
        double Y = scanner.nextDouble();

        double custoPorCaneta = (Z - Y) / N;

        System.out.println("Cada caneta custou " + custoPorCaneta + " reais.");

        scanner.close();
    }
}
