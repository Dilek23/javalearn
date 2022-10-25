package j18_Constructor.Task;

import java.util.Scanner;

public class Task3_LessonRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Öğrenci ismini giriniz:");
       Tsk3_Student std1=new Tsk3_Student(sc.next());
    }
}
