import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;


public class Cotacao {

    // Metodo que busca a cotação entre duas moedas usando a API / Method that fetches exchange rate from API
    public Double buscarCotacoes(String moedaBase, String moedaDestino) throws IOException, InterruptedException {
        // Monta o endereço da requisição com base na moeda de origem / Builds the request URL with the base currency
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/19254ca335ca314ce07c14b9/latest/" + moedaBase);

        // Cria a requisição HTTP / Builds the HTTP request
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).GET().build();
        // Cria o cliente HTTP e envia a requisição / Creates HTTP client and sends request
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> responde = client.send(request, HttpResponse.BodyHandlers.ofString());
        // Usa Gson para transformar o JSON em objeto Java / Uses Gson to convert JSON into Java object
        Gson gson = new Gson();
        DadosCotacao dados = gson.fromJson(responde.body(), DadosCotacao.class);
        // Retorna a taxa de conversão para a moeda desejada / Returns the desired conversion rate
        return dados.conversion_rates.get(moedaDestino);

    }

}

