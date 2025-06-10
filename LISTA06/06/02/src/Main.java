import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int fatorialRec(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fatorialRec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("N deve ser não-negativo");
            return;
        }

        int fatorial = fatorialRec(N);
        System.out.println("Fatorial de " + N + " = " + fatorial);
        }
    }
