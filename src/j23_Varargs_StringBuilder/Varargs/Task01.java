package j23_Varargs_StringBuilder.Varargs;

public class Task01 {
    public static void main(String[] args) {

/*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.
input : "m", "e", "r", "v", "e";
output : merve

input:"a","l","i"
 */
    String arr1[]= {"m", "e", "r", "v", "e"};
     String arr2[]= {"a","l", "i"};
strBirleştir(arr1);
strBirleştir(arr2);



    }//mainsonu
    public static void strBirleştir(String...str){
        String birLeştiren="";
        for (String w:str){
            birLeştiren=birLeştiren.concat(w);
        }
    System.out.println("birLeştiren = " + birLeştiren);
}



}
