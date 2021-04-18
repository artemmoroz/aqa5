import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextParsing {
    public static void main(String[] args)
        throws IOException {
        TextParsing text = new TextParsing();
        Path path = Paths.get("src/main/resources/Text.txt");
        List <String> lines = Files.readAllLines(path);
        Object[] array = text.createWordsMap(lines).entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .toArray();
        for (int i = array.length -1; i>=0 && i>= array.length-5; i--){
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)array[i];
            System.out.println(entry.getKey());
        }
    }
    public HashMap<String, Integer> createWordsMap (List<String> lines) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String line: lines){
            String[] words = line.split(" ");
            for (String word: words){
                if (!map.containsKey(word)) map.put(word,1);
                else map.replace(word, map.get(word) + 1);
            }
        }
        return map;
    }

}
