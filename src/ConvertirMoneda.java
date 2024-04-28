import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConvertirMoneda {

    public Moneda convierteMoneda (String monedaBase, String monedaDestino){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese el monto que quiere convertir");
        Double monto = ingreso.nextDouble();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/acd90d197db6d9ac1890ff41/pair/" +
                monedaBase + "/" + monedaDestino + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la Divisa");
        }
    }
}
