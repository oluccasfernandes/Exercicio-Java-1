import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        // Solicita a entrada do usuário para o número de horas trabalhadas no mês
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        // Solicita a entrada do usuário para o percentual de desconto do INSS
        System.out.print("Digite o percentual de desconto do INSS (%): ");
        double percentualINSS = scanner.nextDouble();

        // Calcula o salário bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // Calcula o valor do desconto do INSS
        double descontoINSS = salarioBruto * (percentualINSS / 100);

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto - descontoINSS;

        // Exibe o resultado
        System.out.println("O salário líquido do funcionário é: R$" + salarioLiquido);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
