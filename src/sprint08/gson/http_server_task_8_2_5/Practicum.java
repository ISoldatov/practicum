package sprint08.gson.http_server_task_8_2_5;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;

public class Practicum {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
//        httpServer.stop(1);
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String response;

            // извлеките метод из запроса
            String method = httpExchange.getRequestMethod();

            switch (method) {
                // сформируйте ответ в случае, если был вызван POST-метод
                case "POST":
                    // извлеките тело запроса
                    InputStream is = httpExchange.getRequestBody();
                    String body = new String(is.readAllBytes());

                    // извлеките path из запроса
                    String path = httpExchange.getRequestURI().getPath();
                    // а из path — профессию и имя
                    String[] parametersPath = path.split("/");
                    String profession = parametersPath[2];
                    String name = parametersPath[3];

                    // извлеките заголовок
                    String goodDayHeader = "";
                    List<String> wishGoodDay = httpExchange.getRequestHeaders().get("X-Wish-Good-Day");
                    if (wishGoodDay != null && wishGoodDay.get(0).equals("true")) {
                        goodDayHeader = "Хорошего дня!";
                    }

                    // соберите ответ
                    response = body + ", " + profession + " " + name + "! " + goodDayHeader;
                    // не забудьте про ответ для остальных методов
                    break;
                case "GET":
                    response = "Здравствуйте!";
                    break;
                default:
                    response = "Некорректный метод!";
            }

            httpExchange.sendResponseHeaders(200, 0);
            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}
