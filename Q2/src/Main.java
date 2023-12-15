import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static char pegarInformacoes(String unidade, Scanner scanner){
        char character;
        do{
            System.out.print("Qual a unidade de " + unidade +  " dessa temperatura? [C, K, F] ");
            character = scanner.next().charAt(0);
            if(character == 'C' || character == 'K' || character == 'F'){
                break;
            }
            System.out.println("Entrada especificada não é válida");
        }while(true);
        
        return character;
    }

    private static double converterTemperatura(char origem, char destino, double temperatura){
        double resultado;
        if(origem == 'C' && destino == 'F'){
            resultado = (temperatura * 9 / 5) + 32;
        }
        else if(origem == 'C' && destino == 'K'){
            resultado = 273.15 + temperatura;
        }
        else if(origem == 'K' && destino == 'C'){
            resultado = temperatura - 273.15;
        }
        else if(origem == 'K' && destino == 'F'){
            resultado = ((temperatura - 273.15) * 9 / 5) + 32;
        }
        else if(origem == 'F' && destino == 'C'){
            resultado = (temperatura - 32) * 5 / 9;
        }
        else{
            resultado = 273.15 + ((temperatura - 32) * 5 / 9);
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma temperatura para ser transformada:");
        double temperatura = scanner.nextFloat();

        char origem = pegarInformacoes("entrada", scanner);
        char destino = pegarInformacoes("destino", scanner);

        double temperaturaConvertida = converterTemperatura(origem, destino, temperatura);
        System.out.printf("%.2f %c = %.2f %c", temperatura, origem, temperaturaConvertida, destino);
    }
}