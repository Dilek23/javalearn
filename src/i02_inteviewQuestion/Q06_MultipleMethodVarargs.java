package i02_inteviewQuestion;

public class Q06_MultipleMethodVarargs {  /*
farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
yazdıran parametreli method yazınız
*/
    public static void main(String[] args) {
  ortalamaBul("Fatih",56,67,45,34,65,54);
  ortalamaBul("nazlı",54,76,97,75);
  ortalamaBul("emine",54,76,54);
  ortalamaBul("Tugba",100,80,90,54,32);

        
    }

    private static void ortalamaBul(String name,double...notes) {
        double sum=0;
        for (double each:notes   ) {
          
            sum+=each;
        }
        System.out.println("sum/notes.length = " + sum/notes.length);
    }
}
