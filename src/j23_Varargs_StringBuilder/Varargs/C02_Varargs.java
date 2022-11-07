package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs method:
         */
    int arr[]={24,42,33,19,34,45,58,38};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));//293
        System.out.println("varargsTopla() = " + varargsTopla(24,42,33,19,34,45,58,38));//293
        System.out.println("varargsTopla(arr) = " + varargsTopla(arr));//293
        // task-> array elememanlrını print eden metod creat et
      // Task2-> task 1 varargs ile calış

    }// main sonu...
    public static int arrTopla(int[] a){
        int toplam=0;
        for (int i:a){
            toplam+=i;
        }
        return toplam;
    }
    public static int varargsTopla(int...b){
        int toplam=0;
        for (int s:b){
            toplam+=s;
        }
        return toplam;
        }
    }





