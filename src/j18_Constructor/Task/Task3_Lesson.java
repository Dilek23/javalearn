package j18_Constructor.Task;

import java.util.ArrayList;

public class Task3_Lesson {
	 /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz
     */

	public int credi;

String dersİsmi;
int credit;
public Task3_Lesson(String dersİsmi){
	this.dersİsmi=dersİsmi;

}
public class Tsk3_Student{
	String StudentName;
	int maxCredit;
	ArrayList<Task3_Lesson>dersler=new ArrayList<>();
}





}
