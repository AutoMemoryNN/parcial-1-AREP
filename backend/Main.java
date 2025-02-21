import java.io.IOException;

import gpt.ChatGPT;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(ChatGPT.classinfo("gpt.ExampleClass"));
            System.out.println(ChatGPT.invoke("gpt.ExampleClass", "computePI"));
            System.out.println(ChatGPT.unaryInvoke("gpt.ExampleClass", "showParam", "int", "Hola"));
            System.out.println(ChatGPT.binaryInvoke("gpt.ExampleClass", "concat", "int", 1, "string", "uno"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            WebServer server = new WebServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}