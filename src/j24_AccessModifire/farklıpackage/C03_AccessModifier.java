package j24_AccessModifire.farklıpackage;

import j24_AccessModifire.C01_AccessModifire;

public class C03_AccessModifier {
     private String teamLead="Hakan";
     String defaultName="Cebrail";
     protected  String protectedName="Dilek";
     public String publicName="Gamze";

     public static void main(String[] args){
        C01_AccessModifire obj9=new C01_AccessModifire(23,45);
         System.out.println("obj9.publicyas = " + obj9.publicYas);
         obj9.protectedMethod();// protected method call edilemez
     }
}
