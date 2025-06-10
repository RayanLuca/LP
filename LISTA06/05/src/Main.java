import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 3, 5, 7, 9, 11, 13, 15}; // Exemplo de array ordenado
        System.out.print("Digite o número a ser buscado: ");
        int alvo = sc.nextInt();

        int inicio = 0, fim = array.length - 1, posicao = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == alvo) {
                posicao = meio;
                break;
            } else if (alvo < array[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        if (posicao != -1) {
            System.out.println("Elemento encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}