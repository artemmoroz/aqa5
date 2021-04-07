package by.issoft.files;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReadFiles {

    public static void mainPlain(String[] args) throws IOException {
        String path = "/Users/artemmoroz/Projects/training/aqa5/src/main/resources/sample1.json";
        String content = new String(Files.readAllBytes(Paths.get(path)),"UTF-8");
        System.out.println(content);
        System.out.println("----------");
        List<String> stringList = Files.readAllLines(Paths.get(path));
        stringList.forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        System.out.println("*************");
        String path = new File("").getAbsolutePath()+
                File.separator+
                "src"+File.separator+"main/resources/sample1.json";

        Paths.get(System.getProperty("user.dir")).resolve("src").resolve("main");

        ReadFiles.class.getClassLoader().getResource("sample00.json");

        //String content = new String(Files.readAllBytes(Paths.get(path)),"UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(new File(path), User.class);
        System.out.println(user);
        user.setName("Alex");

        mapper.writeValue(new File("/Users/artemmoroz/Projects/training/aqa5/src/main/resources/sample00.json"), user);
    }
}
