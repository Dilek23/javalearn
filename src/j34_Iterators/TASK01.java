package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class TASK01 {
    public static void main(String[] args) {
        /*
         verilen bir integer listin tek elemanlarını karesini  tersten iteraot print eden code creat edini<
         */
       /* ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(23,44,1,9,2,12));
        ListIterator<Integer>it1=list1.listIterator();
        while (it1.hasNext()){
           it1.next();
        }
while (it1.hasPrevious()){
    int teknum= it1.previous();
    System.out.print(teknum%2==1?teknum*teknum+" ":"");

}

        */
        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(23,44,1,9,2,12));
        ListIterator<Integer>it1= list1.listIterator();

        while (it1.hasNext()){
            it1.next();
        }
        while (it1.hasPrevious()){

            int teknum=it1.previous();
            System.out.print(teknum%2==1?teknum*teknum+" ":"");
        }

            }


    }

