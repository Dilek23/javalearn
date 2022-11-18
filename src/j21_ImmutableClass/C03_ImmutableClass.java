package j21_ImmutableClass;

import java.util.ArrayList;

public class C03_ImmutableClass {
        public C03_ImmutableClass() {
        }

        public static void main(String[] args) {
        /*
/*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */
String name="Merve";
        System.out.println(name);
name.concat("javacan");
        System.out.println("name = " + name);// String name variable meth sonrası aynı degerde kadı immutable
        ArrayList<String>isimList = new ArrayList<>();
        System.out.println(isimList);
        isimList.add("Fatih");
        isimList.add("erkan");
        isimList.add("serhat");
        isimList.add("javacan");
        isimList.remove(1);
        System.out.println("isimList = " + isimList);
    }


}
