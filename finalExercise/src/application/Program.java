package application;

import model.services.FileServices;

import java.util.Map;

public class Program {
    public static void main(String[] args) {

        String path = "/home/larramendi/IdeaProjects/Map/finalExercise/src/files/results.csv";

        Map<String, Integer> map = FileServices.returnMap(path);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
