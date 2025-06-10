import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int buscaBinariaRec(int[] array, int alvo, int inicio, int fim) {
        if (inicio > fim) return -1;

        int meio = (inicio + fim) / 2;

        if (array[meio] == alvo) {
            return meio;
        } else if (alvo < array[meio]) {
            return buscaBinariaRec(array, alvo, inicio, meio - 1);
        } else {
            return buscaBinariaRec(array, alvo, meio + 1, fim);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15}; // Vetor ordenado

        System.out.print("Digite o número a ser buscado: ");
        int alvo = sc.nextInt();

        int posicao = buscaBinariaRec(array, alvo, 0, array.length - 1);

        if (posicao != -1) {
            System.out.println("Elemento encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}