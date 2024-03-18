import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = input.nextLine(); 

        System.out.println("Digite o seu endereço:");
        String endereco = input.nextLine();

        System.out.println("Digite o seu telefone:");
        String telefone = input.nextLine();

        System.out.println("\nInformações digitadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);

        input.close(); 
    }
}
