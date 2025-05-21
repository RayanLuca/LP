import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double x1, x2, a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira raiz:");
        x1 = in.nextDouble();

        System.out.println("Digite a segunda raiz:");
        x2 = in.nextDouble();

        a = 1;
        b = -(x1 + x2);
        c = x1 * x2;

        System.out.println("Equação do segundo grau: x² + (" + b + ")x + (" + c + ") = 0");
    }
}