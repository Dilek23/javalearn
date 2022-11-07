package j24_AccessModifire;

public class C02_AccessModifire {
    public static void main(String[] args) {
        // C01_AccessModifier obj1 = new C01_AccessModifier();//private p'siz cons calll edilemz
       C01_AccessModifire obj2 = new C01_AccessModifire(23,45);//publiv 2 p'li cons call edildi
//C01_AccessModifire obj4=new C01_AccessModifire();// private call edilemz
        System.out.println("obj2.defaultYas"+obj2.defaultYas);
        obj2.protectedMethod();
        System.out.println("obj2 = " + obj2.publicYas);
        System.out.println("obj2 = " + obj2.protectedYas);
       // obj2.privateMethod();// private metod call edilemez.yoruma aldık
    }
}
