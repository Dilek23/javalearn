package day08;

public class day10 {
    public static void main(String[] args) {
        // verilen String degerinin icerdigi karakter sayılarını yazdıran kod creat et.
      String str="hfdsusfdodje342g43y+$$%&&& 1235660+-*/ " ;
      //1.aşama verilen bütün karakterleri gezecegim için for loopa ihtiyacım var.
      //2.  str ifadesindeki her karakterden sadee 1 adet iceren bir string gerekiyor.

      String benzersizStr="";
        for (int i = 0; i <str.length()-1 ; i++) {
          if(!benzersizStr.contains(""+str.charAt(i))) {// ! içermiyor ise anlamı tasır.burada "" boş atmamızın sebebi containsi karakteri stringe ceviririz.
              benzersizStr+="" +str.charAt(i);
          }
        }
        System.out.println(benzersizStr);

        for (int i = 0; i <=benzersizStr.length()-1 ; i++) {
           int sayac=0;

            for (int j = 0; j <=str.length()-1 ; j++) {
              if(benzersizStr.charAt(i)==str.charAt(j)){
                  sayac++;
              }
            }
            System.out.println("karakter"+benzersizStr.charAt(i)+" ="+sayac);
        }



    }
}
