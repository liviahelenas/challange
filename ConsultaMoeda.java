import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    /*Endereco na Web da API*/

        public InformacoesMoeda consultaMoeda(String moeda) throws IOException, InterruptedException {
            URI Endereco = URI.create("https://v6.exchangerate-api.com/v6/9c72da061147352699297ad3/latest/USD");

            /*Definindo Cliente e Requisição*/

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(String.valueOf(Endereco)))
                    .build();

            /* "chamando" o Gson: */
            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                Gson gson = new Gson();
                InformacoesMoeda informacoesMoeda = gson.fromJson(response.body(), InformacoesMoeda.class);
                return informacoesMoeda;

                /*lidando com excessoes: */
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("Não consegui obter os dados da moeda!");
            }

        }

    }

