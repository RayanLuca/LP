import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double raio, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Raio");

        raio= in.nextDouble();

        area = raio*raio*3.14;

        System.out.println("Area =" + area);
        }
    }