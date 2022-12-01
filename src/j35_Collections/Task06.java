package j35_Collections;

import java.util.LinkedHashSet;
import java.util.List;

public class Task06 {
    public static void main(String[] args) {
       /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>(List.of(4,2,3,1,7));
        System.out.println("HashSetin eleman sayisi = " + totalCount(lhs));
    }

    private static int totalCount(LinkedHashSet<Integer> lhs) {
        return lhs.size();
    }


}
