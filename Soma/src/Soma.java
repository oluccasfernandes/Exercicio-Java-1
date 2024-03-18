import java.util.Scanner;

public class Soma {
    public static void main(String[] args) throws Exception {
        int number1;
        int number2;
        double valorInteiro;
        Scanner input = new Scanner (System.in);

        System.out.println("\nInforme um numero: ");
        number1 = input.nextInt();

        System.out.println("\nInforme um numero: ");
        number2 = input.nextInt();

        valorInteiro = (double) (number1 + number2);
        System.out.println("Valor total dos numeores é:" + valorInteiro);

    }
}
