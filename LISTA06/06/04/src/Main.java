import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean ehPalindromoRec(String texto, int inicio, int fim) {
        if (inicio >= fim) return true;
        if (texto.charAt(inicio) != texto.charAt(fim)) return false;
        return ehPalindromoRec(texto, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();

        texto = texto.replaceAll("\\s+", "").toLowerCase();

        boolean resultado = ehPalindromoRec(texto, 0, texto.length() - 1);

        if (resultado) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}