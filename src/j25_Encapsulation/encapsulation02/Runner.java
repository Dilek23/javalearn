package j25_Encapsulation.encapsulation02;

public class Runner {
    public static void main(String[] args) {
 Kisi obj1=new Kisi("ümit","K","umitK33",33);
 obj1.ad="güzel ümit";
        System.out.println("obj1.ad = " + obj1.ad);
        System.out.println("obj1.soyAd = " + obj1.soyAd);
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        obj1.setYas(-34);
        System.out.println("obj1.getYas() = " + obj1.getYas());
    }
}
