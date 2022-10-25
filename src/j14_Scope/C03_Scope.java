package j14_Scope;

public class C03_Scope {


    public static void main(String[] args) {

C01_InstanceVariable kus=new C01_InstanceVariable();//istediğimizclassdan
        //kus getirdik.
        kus.name="ebabil";
        kus.developerMı=false;
        System.out.println(kus.name);
        C01_InstanceVariable.staticMethod();
kus.non_StaticMethod();//obje ile nonstatic metod getirdik.

    }
}
