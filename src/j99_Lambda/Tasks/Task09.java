package j99_Lambda.Tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task09 {
    public static void main(String[] args) throws IOException {
        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        Path txt = Path.of("src/j99_Lambda/Tasks/C11_textRead");
        Stream<String> akis = Files.lines(txt);
  Files.lines(Paths.get("src/j99_Lambda/Tasks/C11_textRead")).map(String::toLowerCase).map(t -> t.split(" ")).flatMap(Arrays::stream).
          filter(x->x.contains("a")).forEach(Task06::yazdirString);
    }
}
