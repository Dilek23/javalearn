package j99_Lambda.Tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task08 {
    public static void main(String[] args) throws IOException {
        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        Path txt = Path.of("src/j99_Lambda/Tasks/C11_textRead");
        Stream<String> akis = Files.lines(txt);
        System.out.println(Files.lines(Paths.get("src/j99_Lambda/Tasks/C11_textRead")).map(String::toLowerCase).map(t -> t.split(" ")).flatMap(Arrays::stream).
                filter(x -> x.contains("a")).count()+" tane 'a'harfi vardır");
    }
}
