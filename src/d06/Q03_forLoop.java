package d06;

public class Q03_forLoop {
    public static void main(String[] args) {
        //Convert "Java" to "J*a*v*a*"

/* ForLoop
   print even numbers from 100 to 0 but do not use decrement(i--).

        INPUT      :
        OUTPUT  : 100 98 96 94 92 ....2 0
     */
        String str="Java";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+"*");

        }
    for(int i=100;i>=0;i-=2){
        if(i%2==0){
            System.out.print(i+" ");
        }

    }





    }
}
