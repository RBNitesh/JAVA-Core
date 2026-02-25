import com.sun.net.httpserver.*;
import java.io.*;
import java.net.*;

public class SimpleHttpServer{
    public static void main(String[] args) {
        try{
            // Create a HttpServer Instance
            HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

            // Create a context for a specific path and set the handler
            server.createContext("/", new MyHandler());

            // start the sever
            server.setExecutor(null); // use the default executor
            server.start();

            System.out.println("Server is running on the port 8000...");
        }
        catch(IOException e){
            System.out.println("Error starting the server: " +e.getMessage());
        }
    }

    // Define a custom HttpHandler
    public static class MyHandler implements HttpHandler{
        @Override
        public void handle(HttpExchange exchange) throws IOException{
            // Handle the request
            String response = "Hello, this is a simple http server response!";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}