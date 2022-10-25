package j18_Constructor;

public class C03_StudentRunner {
  
    public String toString() {
        
        return "C03_StudentRunner{}";
    }

    public static void main(String[] args) {
C03_Student ogrenci1=new C03_Student();//ogrnc1
      ogrenci1.ad="fatih";
      ogrenci1.soyad="Ataş";
      ogrenci1.sınıf=1;
      ogrenci1.okulNo=1001;
      ogrenci1.ortalama=77;
      ogrenci1.takdir=false;
        System.out.println(ogrenci1);//j18_Constructor.C03_Student@17c68925


        ogrenci1.mezuniyet();// diplomanız hayırlı olsun:)
// task-> diger bir ognci objesiyle tum fieldleri atayıpprnt et
        C03_Student ogrenci3=new C03_Student();
        ogrenci3.ad="yunus emre";
        ogrenci3.soyad="bAyk";
        ogrenci3.sınıf=1;
        ogrenci3.okulNo=1449;
        ogrenci3.ortalama=100;
        ogrenci3.takdir=true;

        System.out.println("ogrenci3 = " + ogrenci3);
        
    }
}
