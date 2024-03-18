import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      
    System.out.println("DIgite a sua idade:"); 
    int idade = input.nextInt();
     int diasdevida = 365;
      double valorReal = idade * diasdevida;

      System.out.println("Você ja viveu: " + valorReal + "dias");
          
      input.close();
        }
}
