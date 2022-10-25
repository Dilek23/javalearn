package Tasks_Arrayeasy;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String fruit[]={"Apple , Orange , Banana , Pineapple"};
     boolean flag=true;
        for (int i = 0; i < fruit.length ; i++) {
            if(fruit[i].equalsIgnoreCase("apple")){
                flag=true;
                break;
            }
        }
        System.out.println(flag);
    }
}
