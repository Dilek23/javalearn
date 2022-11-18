package j32_Abstract.abstact01;

public abstract class Honda {// parent abstract classs

    public abstract void motor();
     void sunroof(){
         System.out.println("Extra confo extra ucret gerektirir...");
     }
     // abs parent class da variable tanımlanabilir mi?
    String name ="gülsüm team lead";
     // variablellr abtract olur mu?-> Kesinlikle  hayır olamaz
   // public abstract int yas =48;variableller somuttur abstract olmaz
    abstract void koltuk();
     abstract void kapi();

  //   final void finalMethod();// concret metod bodysiz olamaz.
    //final abstract void finalMethod();// abs metod final olamaz

  //  private  void privteMethod();// concret metod bodysiz olamaz.
   //

   // static void gunesMetod();//concret metod bodysiz olamaz.
    //static abstract void gunesMetod();// abs metod statico lama
  //  Honda obj=new Honda();// melekler dugurmaz yani abs class obje uretmez...



}
