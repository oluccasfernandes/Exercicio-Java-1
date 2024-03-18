public class Main {
    public static void main(String[] args) {
        System.out.println("Número\t\tQuadrado\tCubo");
        for (int i = 0; i <= 10; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + "\t\t" + quadrado + "\t\t" + cubo);
        }
    }
}
