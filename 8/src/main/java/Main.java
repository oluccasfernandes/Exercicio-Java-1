import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de metros: ");
        double metros = input.nextDouble();

        double centimetros = metros * 100;

        System.out.println(metros + " metros é igual a " + centimetros + " centímetros.");

        input.close();
    }
}
