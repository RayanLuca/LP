import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double mm, pol;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a medida em pol:");

        pol = in.nextDouble();

        mm = pol * 25.4;

        System.out.println("mm =" + mm);

    }
}