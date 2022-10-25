package j18_Constructor.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tsk3_Student {
    String studentName;
    int maxCredit;
ArrayList<Task3_Lesson> dersler=new ArrayList<>();
public Tsk3_Student(String next){
    Scanner sc=new Scanner(System.in);
    studentName=sc.next();
    while (maxCredit<=10) {
        System.out.print("Ders adını giriiniz:");
        Task3_Lesson drs = new Task3_Lesson(sc.next());
        System.out.println(drs.dersİsmi + "dersin credisini giriniz: ");
        drs.credi = sc.nextInt();
        if (maxCredit + drs.credit <= 10) {
            maxCredit += drs.credit;
            dersler.add(drs);
            continue;
        } else System.out.println("Maksimum 30 credi miktarını aştıgınız için " + drs.dersİsmi + " dersini alamadınız");
        break;
    }
    System.out.println("Adınız :"+studentName+"\nAldığınız dersler :");
   for(Task3_Lesson lesson:dersler) {
       System.out.println(lesson.dersİsmi + " : " + lesson.credit);
   }
    System.out.println("maxCredit = " + toplamKredi());
    }

    private int toplamKredi() {
    return maxCredit;
    }


}

