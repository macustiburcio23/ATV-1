import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v1, v2, v3;

        System.out.println("Digite o primeiro número:");
        v1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        v2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        v3 = scanner.nextInt();

        System.out.println("Os números digitados são:");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        scanner.close();
    }
}
