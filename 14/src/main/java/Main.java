import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        // Troca os valores de A e B
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Depois da troca:");
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);

        scanner.close();
    }
}
