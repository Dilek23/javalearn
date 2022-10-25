package d10;

public class C4_OddEvenNumber {
    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cif sayi ise cift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz
        int min=1;
        int max=80;
        int randomNum= (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNum = " + randomNum);
if(randomNum%2==0){
    System.out.println("Sayi cift");
}else System.out.println("sayı tek ");
// ikici cozum
        int randomSayi= (int) (Math.random()*80);
        System.out.println("randomSayi = " + randomSayi);
        System.out.println(randomSayi%2==0?"cift":"tek");

    }
}
