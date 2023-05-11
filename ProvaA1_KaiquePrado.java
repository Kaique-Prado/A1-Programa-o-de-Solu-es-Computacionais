import java.util.Scanner;

public class ProvaA1_KaiquePrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entradas
        System.out.print("Coloque seu nome: ");
        String nome = scanner.next();
        System.out.println("");

        System.out.print("Coloque seu peso em Kg: ");
        double peso = scanner.nextDouble();
        System.out.println("");

        System.out.print("Coloque a quantidade de água ingerida até agora: ");
        int quantidadeAgua = scanner.nextInt();
        System.out.println("");

        scanner.close();

        //Processamento

        double quantidadeIdealAgua = 0.035 * peso;

        double quantidadeIngerir = quantidadeIdealAgua - quantidadeAgua;

        //Saída

        System.out.print("Seu nome é " + nome);
        System.out.println("");

        System.out.print("Seu peso é " + peso);
        System.out.println("");

        System.out.print("A quantidade ingerida de água até agora foi: " + quantidadeAgua + " litros");
        System.out.println("");

        System.out.printf("A quantidade ideal de água a ingerir é: "+ Math.ceil(quantidadeIdealAgua) + " litros");
        System.out.println("");

        System.out.println(validarIngestaoAgua(quantidadeIngerir));

    }
    
    //Valida a quantidade igerida e imprime uma mensagem
    private static String validarIngestaoAgua (double quantidadeIngerir) {
        String validarIngestao = "";
        
        if (quantidadeIngerir < 0) {
             validarIngestao = ("Parabéns, você atingiu a meta de hidratação diária");
        } else if (quantidadeIngerir >= 0) {
             validarIngestao = ("Continue focado em se hidratar, ainda faltam "+ Math.round(quantidadeIngerir) +" litros! Você consegue!");
        }
        
        return validarIngestao;
    }

}