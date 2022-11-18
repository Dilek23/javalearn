package P08_LaptopStoreCoding;

import java.util.ArrayList;

public class Calculation {
    public static int getRam(ArrayList<String>arr){
        int price=0;
        for (int i = 0; i <arr.size() ; i++) {
           if(arr.get(i).contains("32gb"))
               price+=300;
           if(arr.get(i).contains("16gb"))
               price+=200;
           if(arr.get(i).contains("8gb"))
               price+=100;
           if(arr.get(i).contains("4gb"))
               price+=50;
        }

        return price;





    }
    public static int getcPu(ArrayList<String>arr) {
        int price = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("32gb"))
                price += 300;
            if (arr.get(i).contains("16gb"))
                price += 200;
            if (arr.get(i).contains("8gb"))
                price += 100;
            if (arr.get(i).contains("4gb"))
                price += 50;


        }
        return price;
    }
        public static int getColor(ArrayList<String>arr) {
            int price = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).contains("Red"))
                    price += 400;
                if (arr.get(i).contains("Orange"))
                    price += 300;
                if (arr.get(i).contains("Silver"))
                    price += 200;
                if (arr.get(i).contains("Black"))
                    price+=150;


            }
            return price;
        }
    public static int getsize(ArrayList<String>arr) {
        int price = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).contains("min"))
                price+=100;
            if (arr.get(i).contains("middle"))
                price+=200;
            if (arr.get(i).contains("max"))
                price+=300;


        }
        return price;




    }
}