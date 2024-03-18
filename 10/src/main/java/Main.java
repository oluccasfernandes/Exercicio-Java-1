import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Converte Fahrenheit para Celsius usando esta fórmula 
        double celsius = (fahrenheit - 32) / 9 * 5;

        // Exibecao o resultado
        System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
