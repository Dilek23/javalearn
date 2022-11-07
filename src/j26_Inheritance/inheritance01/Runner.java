package j26_Inheritance.inheritance01;

import j26_Inheritance.inheritance01.Balik;
import j26_Inheritance.inheritance01.Hayvancik;
import j26_Inheritance.inheritance01.Mammal;

public class Runner {
    public static void main(String[] args) {
/*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
     Hayvancik hyvn=new Hayvancik();
     hyvn.hareket();
     hyvn.içme();
     hyvn.yeme();

        System.out.println("  ***   ");
         Mammal m1=new Mammal();
         m1.sutBeslenme();
         m1.dogum();
         m1.içme();// parent hayvancık Class call
         m1.yeme();// parent hayvancık Class call
         m1.hareket();

        System.out.println("   ***   ");

        Balik hms=new Balik();// balık clasındaki default cons. ve gizli super cons. ile clışır
        hms.yüzer();// bu özellik balık clasından geldi
        hms.yeme();// hayvancık parentinden geldi
        hms.içme();
        hms.hareket();
        System.out.println("  ***  ");
        Kedi kd=new Kedi();
        kd.tırmalar();
        kd.hareket();
        kd.yeme();
        kd.içme();
        kd.dogum();
        kd.sutBeslenme();

        System.out.println("   ***   ");

        Koyun ky=new Koyun();
        ky.semir();
        ky.hareket();
        ky.yeme();
        ky.içme();
        ky.sutBeslenme();
        ky.dogum();


    }
}
