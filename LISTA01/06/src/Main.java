import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double kh, ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em ms:");

        ms = in.nextDouble();

        kh = ms * 3.6;

        System.out.println("kh =" + kh);

    }
}