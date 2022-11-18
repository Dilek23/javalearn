package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("C:\\Users\\seyda-pc\\IdeaProjects\\javalearn\\src\\j29_Exceptions\\ebikGabık");
            int k;

            try {
                while ((k = fis.read()) != -1) {
                    System.out.println((char) k);
                }

                System.out.println("içteki try dan selam");
            } catch (IOException e) {
                System.out.println("dosya okunamıyor");
                System.out.println("içteki catch blocktan selamlar");
            }
            System.out.println("dışatki try blocktan selamlar");


        } catch (FileNotFoundException e) {
            System.out.println("Dosyaya ulasılamiyor");
            System.out.println("dıştaki catch blokdan selam");
        }
        System.out.println("sorun handle edildi devam et");
    }

}


