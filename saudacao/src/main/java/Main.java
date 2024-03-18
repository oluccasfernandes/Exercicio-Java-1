import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu primeiro nome:");
        String nome = input.next();

        System.out.println("Olá, " + nome + "! Seja Bem-vindo!");

        input.close(); 
    }
}