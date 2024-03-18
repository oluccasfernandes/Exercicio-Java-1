import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário:");
        double salario = input.nextDouble();

        double reajuste = salario * 0.07;

        double valorReal = salario + reajuste;

        System.out.println("O valor do seu salário reajustado é: R$" + valorReal);

        input.close();
    }
}