import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a, b, x;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente a:");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente b:");
        b = in.nextDouble();

        if (a != 0) {
            x = -b / a;
            System.out.println("Solução: x = " + x);
        } else {
            System.out.println("A equação não é do 1º grau.");
        }
    }
}