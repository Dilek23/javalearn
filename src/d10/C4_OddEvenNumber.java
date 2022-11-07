package d10;

public class C4_OddEvenNumber {
    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cif sayi ise cift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz
        int min=1;
        int max=90;
        int randomNum= (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNum = " + randomNum);
        System.out.println(randomNum%2==0?"sayımız çift":"sayimiz tek ");
// ikici cozum
        int randomSayi= (int) (Math.random()*90);
        System.out.println("randomSayi = " + randomSayi);
        System.out.println(randomSayi%2==0?"cift":"tek");
// tekrar çözüm:
        int randomNum1=(int)(Math.random()*90);
        System.out.println("randomNum1 = " + randomNum1);
        System.out.println(randomNum1%2==0?"sayı çift":"sayı tek:(");


    }
}
