import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double milhas,km;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a distância em milhas:");

        milhas = in.nextDouble();

        km = milhas/0.6214;

        System.out.println("km ="+ km);

    }
}