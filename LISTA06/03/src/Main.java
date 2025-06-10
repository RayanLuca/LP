import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base");
        int x = sc.nextInt();

        System.out.print("Digite o expoente");
        int y = sc.nextInt();

        if (y < 0) {
            System.out.println("O expoente deve ser maior ou igual a zero.");
            return;
        }

        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }

        System.out.println(x + " elevado a " + y + " = " + resultado);
        }
    }
