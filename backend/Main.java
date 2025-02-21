import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            WebServer server = new WebServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}