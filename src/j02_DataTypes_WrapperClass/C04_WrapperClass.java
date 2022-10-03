package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Haluk";
       int yas=33;
        System.out.println(name.toUpperCase());
//TASK id ve tc String değerlernin toplamını print eden code yazınız
String tc="123455";
String id="98765";
        System.out.println(tc+id);

  String okulNo="2345321";
  int yeniOkulno= Integer.valueOf(okulNo);
        System.out.println("yeniOkulno = " + yeniOkulno);
        System.out.println("madem geldin dünyaya otur çalış javaya");
        //TASK-> byte short int maximum ve minimum değerlerini print eden code yazınız.
        byte maXBytedegeri=Byte.MAX_VALUE;
        System.out.println("maXBytedegeri = " + maXBytedegeri);
        byte minimumbyte =  Byte.MIN_VALUE;
        System.out.println(minimumbyte);
        int minimuminteger = Integer.MIN_VALUE;
        System.out.println(minimuminteger);
        int maximuminteger = Integer.MAX_VALUE;
        System.out.println(maximuminteger);
        short minimumshort = Short.MIN_VALUE;
        System.out.println(minimumshort);
        short maximumshort = Short.MAX_VALUE;
        System.out.println(maximumshort);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }



    }

