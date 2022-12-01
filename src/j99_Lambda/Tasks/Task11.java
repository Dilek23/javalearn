package j99_Lambda.Tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task11 {
    public static void main(String[] args) throws IOException {
        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print
        Path txt = Path.of("src/j99_Lambda/Tasks/C11_textRead");
        Stream<String> akis = Files.lines(txt);
        System.out.println(Files.lines(Path.of("src/j99_Lambda/Tasks/C11_textRead")).map(x -> x.split(" ")).flatMap(Arrays::stream).
                distinct().count()+" tane farklı kelime vardır...");
    }
}
