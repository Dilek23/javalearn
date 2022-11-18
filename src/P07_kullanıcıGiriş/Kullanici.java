package P07_kullanıcıGiriş;

import java.time.LocalDateTime;

public class Kullanici {
    String name;// objede deger alcak instnc variable;
    LocalDateTime kayitzamani;//objede deger alcak inst.

    public Kullanici(String name, LocalDateTime kayitzamani) {// parametreli constr.
        this.name = name;
        this.kayitzamani = kayitzamani;
    }

    @Override
    public String toString() {// bu classda oluşruln obj print etmek için toString kullnılır
        return
                "name='" + name + '\'' +
                "kayitzamani=" + kayitzamani;

    }
}

