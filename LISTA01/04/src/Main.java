import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double n1, n2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros separados por espaço:");

        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println("=" + (n1 + n2) / 2);


    }
}
