import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite um número inteiro positivo: ");
                int N = sc.nextInt();

                if (N <= 0) {
                    System.out.println("N deve ser maior que 0");
                }

                int soma = 0;
                for (int i = 1; i <= N; i++) {
                    soma += i;
                }

                System.out.println("Soma de 1 até " + N + " = " + soma);
            }
        }

