package j21_ImmutableClass;

public class C02_OCA_Eguals {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") {
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {// tanımlana atanan degerş a ile aynı havuzda ve referanslari olan b variable
            System.out.println("equals");
        }


    }
    }


