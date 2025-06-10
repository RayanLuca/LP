import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int potenciaRec(int x, int y) {
        if (y == 0) return 1;
        return x * potenciaRec(x, y - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (x): ");
        int x = sc.nextInt();

        System.out.print("Digite o expoente (y ≥ 0): ");
        int y = sc.nextInt();

        if (y < 0) {
            System.out.println("O expoente deve ser maior ou igual a zero.");
            return;
        }

        int resultado = potenciaRec(x, y);
        System.out.println(x + " elevado a " + y + " = " + resultado);
        }
    }
