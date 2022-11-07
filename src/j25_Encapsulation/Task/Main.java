package j25_Encapsulation.Task;

import java.util.Scanner;

public class Main {/*
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

    Main classın içinde;
    girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 12'dir.
    name Steven'dır.

    name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
    "He is 12 years old"

 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("agam adını giresen : ");
        String ad = sc.nextLine();
        System.out.print("agam yasını giresen : ");
        int yas = sc.nextInt();
        Student s1 = new Student(ad, yas);//ad ve yas data p'li cons parametre olarak göderildi s1 obj tanımlandı
    }
}