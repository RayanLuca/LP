import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente a:");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente b:");
        b = in.nextDouble();

        System.out.println("Digite o coeficiente c:");
        c = in.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Raiz única: x = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raízes: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}