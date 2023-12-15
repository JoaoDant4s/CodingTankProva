import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void printResults(int tempoEmMeses, double amortizacao, double saldoDevedorAtual, double taxaJuros, double saldoDevedorTotal){
        double juros_mensal;
        double parcela_mensal;
        double totalPagoDeJuros = 0;
        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$: %.2f com um juros de %.2f%% ao mês\n", amortizacao, saldoDevedorTotal, taxaJuros);
        for(int i = 1; i <= tempoEmMeses; i++){
            juros_mensal = (saldoDevedorAtual * taxaJuros) / 100;
            totalPagoDeJuros += juros_mensal;
            saldoDevedorAtual -= amortizacao;
            parcela_mensal = juros_mensal + amortizacao;
            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n", i, juros_mensal, parcela_mensal, saldoDevedorAtual);
        }
        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f", (saldoDevedorTotal + totalPagoDeJuros), totalPagoDeJuros, saldoDevedorTotal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do empréstimo: ");
        double saldoDevedorTotal = scanner.nextFloat();
        System.out.print("Informe a taxa de juros: ");
        double taxaJuros = scanner.nextFloat();
        System.out.print("Em quanto tempo quer pagar? ");
        int tempoEmMeses = scanner.nextInt();


        double amortizacao = saldoDevedorTotal / tempoEmMeses;
        double saldoDevedorAtual = saldoDevedorTotal;
        printResults(tempoEmMeses, amortizacao, saldoDevedorAtual, taxaJuros, saldoDevedorTotal);
    }
}