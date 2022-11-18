package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
       // LocalDate date= LocalDate.of(2022,11,33);// 33 olmaz gün //Rte ver

try {
    LocalDate date= LocalDate.of(2022,11,33);
    System.out.println("Try calıştı prg hatasız");

}catch (DateTimeException e) {

    System.out.println("hatan: "+e.getMessage());
    System.out.println("ay 33 gün olmaz!");
}
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur


    }
}
