package sprint08.http_client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientException {
    public static void main(String[] args) {
        String url = "https://www.ya.ru/";

        // добавьте отлов и обработку исключений вокруг кода ниже
        try {
            URI uri = URI.create(url);

            // создаём запрос
            HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();

            // создаём HTTP-клиент
            HttpClient client = HttpClient.newHttpClient();

            // отправляем запрос

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // выводим код состояния и тело ответа
            System.out.println("Код состояния: " + response.statusCode());
            System.out.println("Тело ответа: " + response.body());
        } catch (IOException | InterruptedException e) {
            System.out.println("Во время выполнения запроса возникла ошибка. Проверьте, пожалуйста, URL-адрес и повторите попытку.");
        }
    }
}

