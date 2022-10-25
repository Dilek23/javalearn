package j11_MethodCreation;

public class C04_MethodDDepo {
/*
her clas da main method mecburiteti yoktur belirli aksiyonlara
 */
   // main method olmaycak motor yok malzeme tasıyan römork
public static void gecmeNotu(int not){
    if (not >= 85) {
        System.out.println("Tebrikler başarlısın");
    } else if (not>=70) {
        System.out.println("başarılı:)");

    } else if (not>=60) {
        System.out.println("sadece gectin");

    } else if (not>=45) {
        System.out.println("ucuz yırttın:(");
    }else System.out.println("kaldınız:(");
}
public static void topla(int a,int b){
    System.out.println(a+b);
}

}









