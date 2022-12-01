package j99_Lambda.Tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Task12 {
    public static void main(String[] args) throws IOException {

        //TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz
        Path txt = Path.of("src/j99_Lambda/Tasks/C11_textRead");
        Stream<String> akis = Files.lines(txt);







    }
}
