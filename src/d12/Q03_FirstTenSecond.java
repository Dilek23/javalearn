package d12;

import java.time.LocalDateTime;

public class Q03_FirstTenSecond {
    public static void main(String[] args) {
        LocalDateTime time=LocalDateTime.now();
        System.out.println("time = " + time);
        if(time.getSecond()<=10){
            System.out.println("ilk on saniye içinde");
        }else
            System.out.println("ilk on sn dışında");

    }
}
