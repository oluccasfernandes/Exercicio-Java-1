import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        // Calcula o antecessor e o sucessor do valor dado
        int antecessor = valor - 1;
        int sucessor = valor + 1;

        // Exibe o antecessor e o sucessor
        System.out.println("Antecessor de " + valor + ": " + antecessor);
        System.out.println("Sucessor de " + valor + ": " + sucessor);

        scanner.close();
    }
}
