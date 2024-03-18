import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.println("Digite o valor do dolar:");
      double valordodolar = input.nextDouble();
      
      Double taxadoreal = 4.95;

      Double valorReal = valordodolar * taxadoreal;

      System.out.println("O valor em reais é: R$" + valorReal);
      input.close();
        }
}
