package j35_Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task05 {
    public static void main(String[] args) {
        /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
        LinkedHashSet<String>fruitSet= new LinkedHashSet<>(Arrays.asList( "banana" , "strawberry" , "kiwi" , "pineapple"));
        String str1="banana";
        String str2="peach";
        System.out.println("changeSet(fruitSet,str1,str2) = " + changeSet(fruitSet, str1, str2));
    }

    private static LinkedHashSet<String> changeSet(LinkedHashSet<String> fruitSet, String str1, String str2) {
        if(fruitSet.contains(str1)){
            fruitSet.remove(str1);
            fruitSet.add(str2);
        }
        return fruitSet;
    }
}
