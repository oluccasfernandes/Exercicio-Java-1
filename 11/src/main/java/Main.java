import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int soma;
        Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o primeiro numero:");
      int numb1 = scanner.nextInt();

      System.out.println("Digite o segundo numero:");
      int numb2 = scanner.nextInt();

      System.out.println("Digite o terceiro numero:");
      int numb3 = scanner.nextInt();

      soma = (numb1 + numb2 + numb3);

      double valorReal = soma /3;

      System.out.println("A media dos numeros é: "+ valorReal);
      
        scanner.close();
    }
}
