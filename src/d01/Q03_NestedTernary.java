package d01;

public class Q03_NestedTernary {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
char finalNotu='B';
String result=finalNotu=='A'?"Gayet başarılı":
               finalNotu=='B'?" Başarılı":
                finalNotu=='C'?"Ha gayret":"Digerleri";
        System.out.println("result = " + result);









    }
}
