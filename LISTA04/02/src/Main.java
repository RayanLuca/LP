import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (i == 0) {
                max = number;
                min = number;
            } else {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
        }

        System.out.println("O maior número é: " + max);
        System.out.println("O menor número é: " + min);

        scanner.close();
    }
}
