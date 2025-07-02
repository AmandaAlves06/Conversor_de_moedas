import java.util.Map;


public class DadosCotacao {

    // Resultado da requisição / Request result
    public String result;
    // Código da moeda base da cotação (ex: "USD") / Base currency code (e.g., "USD")
    public String base_code;
    // Mapa que armazena as taxas de conversão para outras moedas / Map that stores conversion rates for other currencies
    public Map<String, Double> conversion_rates;

}
