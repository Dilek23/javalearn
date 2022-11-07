package j02_DataTypes_WrapperClass;

public class C_swapOdev {
    public static void main(String[] args) {
      /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */




       /* System.out.println("*** a çözümü ***");

        int sayi1=20;
        int sayi2=34;
        System.out.println("Değişmeden önce \nsayi1 = "+ sayi1 + "\nsayi2 = "+ sayi2);
        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("Değişimden sonra \nsayi1 = " + sayi1 + "\nsayi2 = " + sayi2);





        // b)
        System.out.println("*** b çözümü ***");
        int num1 = 20;
        int num2 = 34;
        System.out.println("Değişmeden önce \nsayi1 = "+ num1 + "\nsayi2 = "+ num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Değişimden sonra \nsayi1 = " + num1 + "\nsayi2 = " + num2);

        */

        int num1=20;
        int num2=34;
        System.out.println("Degişimden önce= "+num1+"\nDegişimden önce= "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("degişimden sonra= "+num1+"\nDegişimden sonra= "+num2);


    }
}
