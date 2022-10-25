package j18_Constructor;

public class C03_Student {// main olmayan sadece student obje creat etmek için pojo plan old objectjava :obje için standart class
    // main yok.
    // fields->
    String ad;
    String soyad;
   double ortalama;
   int sınıf;
   int okulNo;

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", ortalama=" + ortalama +
                ", sınıf=" + sınıf +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }

    boolean takdir;

    public void mezuniyet(){

       if(ortalama>=50){
           System.out.println("diplomanız hayırlı olsun:)");
       }else System.out.println("seneye de bekleriz :(");



   }













}
