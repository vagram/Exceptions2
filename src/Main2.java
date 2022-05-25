import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        while (true) {
            try {
                List<String> strings = Files.readAllLines(Path.of("src/test"));
                strings.forEach(System.out::println);
            } catch (Exception e) {
                e.printStackTrace();
            }
            new Scanner(System.in).nextLine();
        }

    }
}
