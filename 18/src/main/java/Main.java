import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura de cada degrau (em metros): ");
        double alturaDegrau = scanner.nextDouble();

        System.out.print("Digite a altura que deseja alcançar (em metros): ");
        double alturaDesejada = scanner.nextDouble();

        // Calcular o número de degraus necessários
        int numeroDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau);

        System.out.println("Para alcançar a altura desejada, você precisa subir " + numeroDegraus + " degraus.");
    }
}
