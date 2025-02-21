package gpt;

public class ExampleClass {
    static public int n;
    static public String name;
    static public String nonIdeas;

    static public String computePI() {
        return "3.14159";
    }

    static public String greetMePi() {
        return "Hello i am PI, greetings";
    }

    static public String showParam(String value) {
        return "You parameter was: " + value + "?";
    }

    static public String concat(Object a, Object b) {
        if (a instanceof String || a instanceof Integer || a instanceof Double) {
            if (b instanceof String || b instanceof Integer || b instanceof Double) {
                return "succes concat: " + a + "" + b;
            }
        }

        return "Error unknow types";
    }
}
