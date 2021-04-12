package by.issoft.files;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Data
@Accessors(chain = true)
public class Anna {

    public static Map<String, Integer> sortByValue(final Map<String, Integer> wordCounts) {

        return wordCounts.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }


    public static void main(String[] args) {
        final String regex = "(\\w+)@(\\w+)\\.(\\w{2})";
        final String string = "name@dsgsgfdsgdfsdgs.er  dsgsad gsadsd hasdfhdsfhshahdh na33dfhdsfh25me@dsg65464sdgs.er4353";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }

    public static void main55(String args[]) throws IOException {

        final Map<String, Integer> myMap = new HashMap<>();
        String path = new File("").getAbsolutePath() + "./src/main/resources/Task4.txt";
        //Paths.get(System.getProperty("user.dir")).resolve("src").resolve("main").resolve("resources").resolve("Task4");
        List<String> stringList = Files.readAllLines(Paths.get(path));

        stringList.forEach(newLine -> {
            newLine = newLine.replaceAll("\\\\w*@\\\\w+\\\\.\\\\w{2},", "");
            newLine = newLine.replaceAll("[.]", "");
            String[] words = newLine.split(" ");
            //System.out.println(Arrays.toString(words));
            for (String str : words) {
                if (str.length() == 0) {
                    continue;
                }

                if (myMap.containsKey(str)) {
                    Integer count = myMap.get(str);
                    myMap.put(str, count + 1);
                } else {
                    myMap.put(str, 1);
                }
            }
        });
        final Map<String, Integer> sortedByCount = sortByValue(myMap);

        int count = 0;
        for (Map.Entry<String, Integer> entry: sortedByCount.entrySet()) {
            if(count==5){
                break;
            }
            System.out.println(entry.getKey()+":"+entry.getValue());
            count+=1;
        }
    }


}
