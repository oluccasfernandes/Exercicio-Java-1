import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = input.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo com raio " + raio + " é " + area);
        

        input.close();
    }
}
