import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v1, v2, v3;
        double media;

        System.out.println("Digite o primeiro número:");
        v1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        v2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        v3 = scanner.nextInt();

        media = (v1 + v2 + v3) / 3.0;

        System.out.println("A média dos números é:");
        System.out.println(media);

        scanner.close();
    }
}
