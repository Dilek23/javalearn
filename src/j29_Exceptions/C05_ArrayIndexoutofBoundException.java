package j29_Exceptions;

public class C05_ArrayIndexoutofBoundException {
    public static void main(String[] args) {
     //    ArrayIndexoutofBoundException arraylerde olmayan bir  index elemanı ile islem yapıldıgında olusan RTE excp.
int arr[]={24,27,38,41,54 };
        System.out.println("arr[0] = " + arr[0]);//24


      //  System.out.println("arr[7] = " + arr[7]);//ArrayIndexOutOfBoundsException
      try {
          System.out.println("arr[7] = " + arr[7]);
          System.out.println("Try blokda buyazıyı okuduysan exc.fırlatmadı");
      }catch (ArrayIndexOutOfBoundsException e ) {
          System.out.println("Arrayin boyutunu aştın exception calıştı");
      }

        try {
            System.out.println("arr[2] = " + arr[2]);
            System.out.println("Try blokda buyazıyı okuduysan exc.fırlatmadı");
        }catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("catch calıştı");
        }

        System.out.println("Try blokda buyazıyı okuduysan exc.fırlatmadı");

        System.out.println("Sorun handle edildi...");//bu kod satırı calışmışsa pr sorunsuz


    }
}
