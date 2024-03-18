import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        // Calcula as raízes da equação de segundo grau
        double delta = B * B - 4 * A * C;
        double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
        double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);
      
        System.out.println("As raízes da equação de segundo grau são:");
        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2);

        scanner.close();
    }
}
