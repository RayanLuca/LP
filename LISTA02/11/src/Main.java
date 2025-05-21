import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double celsius,Fahrenheit;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius:");

        celsius= in.nextDouble();

        Fahrenheit = celsius*1.8 + 32;

        System.out.println("Fahrenheit ="+Fahrenheit);


    }
}