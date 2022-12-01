package j99_Lambda.Tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task06 {
    public static void main(String[] args) throws IOException {

        //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..
        Path txt = Path.of("src/j99_Lambda/Tasks/C11_textRead");
        Stream<String> akis = Files.lines(txt);
        Files.lines(Paths.get("src/j99_Lambda/Tasks/C11_textRead")).map(t -> t.split(" ")).
                flatMap(Arrays::stream).sorted().forEach(Task06::yazdirString);
    }


    public static  void yazdirString(String a){
        System.out.println(a+" ");
    }
    }

