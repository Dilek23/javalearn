package j99_Lambda.Tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;
//12.03.2018 · flatmap () v/s map (): 1) map () bir akış alır ve başka bir akışa dönüştürür.
// Akışın her öğesinde bir işlev uygular ve dönüş değerini yeni akışta depolar.
public class Task05 {
    public static void main(String[] args) throws IOException {
//TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz.
        Path txt=Path.of("src/j99_Lambda/Tasks/C11_textRead");
        Stream<String>akis= Files.lines(txt);
      Files.lines(Paths.get("src/j99_Lambda/Tasks/C11_textRead")) .map(t->t.split(" ")).
              flatMap(Arrays::stream).distinct().forEach(t-> System.out.println(t+" "));












    }


}
