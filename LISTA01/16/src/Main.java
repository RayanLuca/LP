import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double raio, altura, volume;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio do cone:");
        raio = in.nextDouble();

        System.out.println("Digite a altura do cone:");
        altura = in.nextDouble();

        volume = (1.0 / 3) * Math.PI * raio * raio * altura;

        System.out.println("Volume = " + volume);

    }
}