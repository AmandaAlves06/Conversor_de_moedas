//import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Cotacao  cotacao = new Cotacao();     // Instância da classe responsável por buscar a cotação / Instance of the class that fetches exchange rates

        while (true){
            // Exibe o menu com as opções de conversão / Displays the conversion options menu

            System.out.println("""
           *******************************************
            Bem-vindo(a) ao Conversor de Moedas!
           *******************************************
        
            Escolha a conversão:
            
            1) Dólar (USD) =>> Peso argentino (ARS)
            2) Peso argentino (ARS) =>> Dólar (USD)
            3) Dólar (USD) =>> Real brasileiro (BRL)
            4) Real brasileiro (BRL) =>> Dólar (USD)
            5) Dólar (USD) =>> Peso colombiano (COP)
            6) Peso colombiano (COP) =>> Dólar (USD)
            7) Sair
        """);
            System.out.println("Digite a opção desejada:");
            int opcao = scanner.nextInt(); // Lê a opção digitada pelo usuário / Reads user option

            if (opcao == 7){// Encerra o programa se o usuário digitar 7 / Ends program if user enters 7

                System.out.println("Programa encerrado. Obrigada por nos escolher e até logo!");
                break;
            }

            // Declara as variáveis para moeda de origem e destino / Declares origin and destination currency variables
            String moedaOrigem = "", moedaDestino = "";

            // Define os códigos das moedas conforme a opção escolhida / Sets the currency codes according to user selection
            switch (opcao){
                case 1 -> {moedaOrigem = "USD"; moedaDestino = "ARS";}
                case 2 -> {moedaOrigem = "ARS"; moedaDestino = "USD";}
                case 3 -> {moedaOrigem = "USD"; moedaDestino = "BRL";}
                case 4 -> {moedaOrigem = "BRL"; moedaDestino = "USD";}
                case 5 -> {moedaOrigem = "USD"; moedaDestino = "COP";}
                case 6 -> {moedaOrigem = "COP"; moedaDestino = "USD";}
                default -> {
                    System.out.println("Opção inválida. Tente novamente");
                    continue; // Volta ao menu / Returns to the menu
                }
            }

            // Solicita o valor a ser convertido / Asks for the value to convert
            System.out.println("Digite o valor que deseja converter: ");
            double valor = scanner.nextDouble();

            // Chama o metodo para buscar a taxa de conversão / Calls the method to fetch exchange rate
            double taxa = cotacao.buscarCotacoes(moedaOrigem, moedaDestino);
            // Realiza o cálculo da conversão / Performs the currency conversion
            double valorConvertido = valor * taxa;
            // Exibe o resultado da conversão / Displays the conversion result
            System.out.printf("➡ %.2f %s = %.2f %s%n", valor, moedaOrigem, valorConvertido, moedaDestino);

        }
        scanner.close();

    }

}