package d01;

public class Q01_Modulus {
    public static void main(String[] args) {
        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
// Hint: use / and %
//    input: 12345
//    output: 1
//            2
//            3
//            4
//            5
        int x=12345;
        int birler=(x/10)%10;
        int yuzler=(x/100)%10;
        int binler=(x/1000)%10;
        int onBinler=(x/10000);
        System.out.println(onBinler+"\n"+binler+"\n" +yuzler+"\n"+birler);
    }
}
