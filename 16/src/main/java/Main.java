import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite a distacia total em km:");
      double distanciaTotal = scanner.nextDouble();

      System.out.println("Digite a qtd de combustivel em litros:");
      double combustivel = scanner.nextDouble();

      double consumoMedio = distanciaTotal / combustivel;

      System.out.println("Consumo medio é: " + consumoMedio);
      
        scanner.close();
    }
}
