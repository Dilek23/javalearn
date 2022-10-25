package j18_Constructor;

public class C04_teacherRunner {
    public static void main(String[] args) {
C04_Teacher ogrt1=new C04_Teacher("ugur", "javacan", 15, 10000, 333, false);
ogrt1.ad="Tugba";
ogrt1.soyad="Ragıp";
ogrt1.branş="Qa";
ogrt1.emekli=false;
ogrt1.maas=23000;
ogrt1.tecrübe=11;
ogrt1.dersSaati();
        System.out.println(ogrt1);
C04_Teacher ogrt2=new C04_Teacher("ugur","javacan",15,10000,333,false);
        System.out.println(ogrt2);//

    }
}
