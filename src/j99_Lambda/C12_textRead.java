package j99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {
    public C12_textRead() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        //TASk 01 Text doyasını okuyup print et
        System.out.println("\n Path tex=Path.of(\"src/j99_Lambda/C11_textRead\");");
        Path tex = Path.of("src/j99_Lambda/C11_textRead");// erişilecek dosyanın pathi tanımlandı
        Stream<String> akıs = Files.lines(tex);
        // Stream<String>akıs1= Files.lines(Path.of("src/j99_Lambda/C11_textRead"));
        akıs.//erişimi verilen dosyadaki satırlar akışa alınır
                forEach(System.out::println);// akıştaki lines(satırlar) print edildi

    //TASK 02-> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
Files.lines(Paths.get("src/j99_Lambda/C11_textRead")).
        map(String::toUpperCase).forEach(System.out::println);
//Files.readAllLines(hlk).stream().map(String::toUpperCase).forEach(System.out::println);
//TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
        Files.lines(Paths.get("src/j99_Lambda/C11_textRead")).
                map(String::toLowerCase).limit(1).forEach(System.out::println);
//TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("   *****   ");
        System.out.println(Files.lines(Paths.get("src/j99_Lambda/C11_textRead")).map(String::toLowerCase).
                filter(t -> t.contains("basarı")).count());
    }

}
