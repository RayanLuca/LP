import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double base, altura, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base do triângulo:");
        base = in.nextDouble();

        System.out.println("Digite a altura do triângulo:");
        altura = in.nextDouble();

        area = (base * altura) / 2;

        System.out.println("Área = " + area);
    }
}