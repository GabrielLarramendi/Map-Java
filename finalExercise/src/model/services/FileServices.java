package model.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileServices {

    public static Map<String, Integer> returnMap(String path) {

        Map<String, Integer> map = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {

                String[] field = line.split(",");
                String name = field[0];
                Integer votes = Integer.parseInt(field[1]);

                if (map.containsKey(name)) {
                    int alreadyHasVotes = map.get(name);
                    map.put(name, votes + alreadyHasVotes);
                }
                else {
                    map.put(name, votes);
                }
                line = br.readLine();
            }

        }
        catch (IOException e) {
            e.getMessage();
        }

        return map;
    }
}
