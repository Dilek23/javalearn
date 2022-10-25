package j20_PassByValeue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {/*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {
        ArrayList<String>calışanlar=new ArrayList<>(List.of("yasin","yunus"));
        ArrayList<String>iŞverenler=new ArrayList<>(List.of("Tugba","Ragıp"));
        ArrayList<String>sirketler=new ArrayList<>(List.of("okul","dersane"));
        ArrayList<ArrayList<String>>list2D=new ArrayList<>(Arrays.asList(calışanlar,iŞverenler,sirketler));

        System.out.println(list2D);

    }
}
