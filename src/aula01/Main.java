package aula01;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("Username", "Gabriel");
        cookies.put("Email", "gabriel@gmail.com");
        cookies.put("Phone", "99909-0200");

        //cookies.put("Phone", "98856-2106");

        System.out.println("Contains 'Phone': " + cookies.containsKey("Phone"));

        cookies.remove("Email");

        System.out.println("All cookies");
        System.out.println("Phone number: " + cookies.get("Phone"));
        System.out.println("Email: " + cookies.get("Email")); // return "null"
        System.out.println("Map size: " + cookies.size());

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
