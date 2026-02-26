import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double b = sc.nextDouble();

        double soma = a + b;

        System.out.println("Soma = " + soma);

        sc.close();
    }
}

