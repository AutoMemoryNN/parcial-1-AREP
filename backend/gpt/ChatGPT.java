package gpt;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ChatGPT {
    static public String classinfo(String className) throws ClassNotFoundException {

        StringBuilder sBuilder = new StringBuilder("Field/Methods List: \n");

        Class<?> c = Class.forName(className);
        for (Field field : c.getDeclaredFields()) {
            sBuilder.append("Field: " + field.getName() + "\n");
        }
        for (Method method : c.getDeclaredMethods()) {
            sBuilder.append("Method: " + method.getName() + "\n");
        }
        return sBuilder.toString();

    }

    static public String invoke(String className, String classMethod) throws Exception {
        for (Method m : Class.forName(className).getDeclaredMethods()) {
            System.out.println(m.getName() + ": ");
            if (classMethod == m.getName()) {
                return m.invoke(m.getDeclaringClass().getDeclaredConstructor().newInstance(), null).toString();
            }
        }
        return "NotFound";
    }

    static public String unaryInvoke(String className, String classMethod, Object type, String value) throws Exception {
        for (Method m : Class.forName(className).getDeclaredMethods()) {
            System.out.println(m.getName() + ": ");
            if (classMethod == m.getName()) {
                return m.invoke(m.getDeclaringClass().getDeclaredConstructor().newInstance(), value).toString();
            }
        }
        return "NotFound";
    }

    static public String binaryInvoke(String className, String classMethod, String type1, Object value1, String type2,
            Object value2) throws Exception {
        for (Method m : Class.forName(className).getDeclaredMethods()) {
            System.out.println(m.getName() + ": ");
            if (classMethod == m.getName()) {
                return m.invoke(m.getDeclaringClass().getDeclaredConstructor().newInstance(), value1, value2)
                        .toString();
            }
        }
        return "NotFound";
    }
}
