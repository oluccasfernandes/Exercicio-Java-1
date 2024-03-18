import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  double x;
  double y;
  double restodadivisao;
    
  Scanner input = new Scanner(System.in);

  System.out.println("Digite o valor de  x:\n");
  x = input.nextDouble();

  System.out.println("Digite o valor de y:\n");
  y = input.nextDouble();

  restodadivisao = x / y;
    
  System.out.println("O resto da divisão de x por y é: " + restodadivisao);

  input.close();
  }
}