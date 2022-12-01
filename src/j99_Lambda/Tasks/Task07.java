package j99_Lambda.Tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task07 {
    public static void main(String[] args) throws IOException {
        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        Path txt = Path.of("src/j99_Lambda/Tasks/C11_textRead");
        Stream<String> akis = Files.lines(txt);
        System.out.println(Files.lines(Paths.get("src/j99_Lambda/Tasks/C11_textRead")).map(String::toLowerCase).map(t -> t.split(" ")).
                flatMap(Arrays::stream).filter(x -> x.contains("basarı")).count());


    }
}
