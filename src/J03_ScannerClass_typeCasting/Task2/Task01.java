package J03_ScannerClass_typeCasting.Task2;


import java.util.Scanner;

public class Task01{

    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner sc=new Scanner(System.in);

        System.out.println("Please,enter mid-term grade:\nPlease,enter final grade:\nPlease,enter project grade:");
        int midtermgrade=sc.nextInt();
        int finalgrade=sc.nextInt();
        int projectgrade=sc.nextInt();
    double generalG=midtermgrade*0.3+finalgrade*0.5+projectgrade*0.20;
        System.out.println("generalG = " + generalG);
    }
}
