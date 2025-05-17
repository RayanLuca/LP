import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double v0, a, t, vf;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial:");
        v0 = in.nextDouble();

        System.out.println("Digite a aceleração:");
        a = in.nextDouble();

        System.out.println("Digite o tempo:");
        t = in.nextDouble();

        vf = v0 + a * t;

        System.out.println("Velocidade final = " + vf);

    }
}