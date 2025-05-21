import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(number +" X "+ i+ " = "+ (number*i));
            i++;
        }

    }
}