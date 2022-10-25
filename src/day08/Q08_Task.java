package day08;

public class Q08_Task {
    public static void main(String[] args) {

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String str[][]= {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
         double tplmDolar=0;
         double tplmEuro=0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                if(str[i][j].contains("$")){
                 tplmDolar+=3.2*(Integer.parseInt(str[i][j].replace("$","")));
                } else if (str[i][j].contains("€")) {
                    tplmEuro+=4.2*(Integer.parseInt(str[i][j].replace("€","")));
                }

            }
        }
        System.out.println("toplam dolar= "+tplmDolar+"tplmEuro+ = " + tplmEuro);
    }
}
