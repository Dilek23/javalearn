package j33_Interfaces;

public interface dısDonanım {
     public void kapi();//abs. metod
    void kaporta();//abs metod
    String RENK="opak kırmızııı";// public static final variabla
    public default  String sisLAmp(){
        return "sisli havada dikkat";
    }

    static void anten(){// static conc. method
        System.out.println("agam sensiz olmazzz");
    }

   // public static void sorunMetod()// CTE static default keyword aynı anda kulllanılamaz
   // public static void main(String[] args){// bad practice-> prodjede tek bir main metod ve  mainclss kullanılır
     //   System.out.println("RENK = " + RENK);
       // aga();// static metot call aedildi
 //   }
}