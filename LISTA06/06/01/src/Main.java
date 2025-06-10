import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int somaRec(int n) {
        if (n == 1) return 1;
        return n + somaRec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("N deve ser maior que 0");
            return;
        }

        int soma = somaRec(N);
        System.out.println("Soma de 1 até " + N + " = " + soma);{
        }
    }
}