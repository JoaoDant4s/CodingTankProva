import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void desenhar(int inteiro){
        for (int i = 1; i <= (inteiro / 2) + 1; i++) {
            for (int j = 0; j < inteiro - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = (inteiro / 2) + 1; i > 0; i--) {
            for (int j = 0; j < inteiro - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int inteiro = scanner.nextInt();

        desenhar(inteiro);
    }
}