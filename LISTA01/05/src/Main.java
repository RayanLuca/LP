import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double kh,ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em kh:");

       kh = in.nextDouble();

       ms = kh/3.6;

        System.out.println("ms ="+ms);



    }
}