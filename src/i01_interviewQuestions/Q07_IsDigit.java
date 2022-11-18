package i01_interviewQuestions;

public class Q07_IsDigit {
      /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */
      public static void main(String[] args) {
          String giris="J4\\/4 1$ 34$¥";
          diGİtSum(giris);


      }

    private static void diGİtSum(String giris) {
          int toplm=0;
        for (int i = 0; i <giris.length() ; i++) {
            if(Character.isDigit(giris.charAt(i))){
                toplm+=Integer.valueOf(""+giris.charAt(i));
            }
            
        }
        System.out.println("toplm = " + toplm);
    }

}
