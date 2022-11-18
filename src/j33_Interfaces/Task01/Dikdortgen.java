package j33_Interfaces.Task01;

public class Dikdortgen implements Sekil{
    @Override
    public int cevre(int... boyut) {
if(boyut.length==1){// varargsa girilen parametre 1 tane is kare cevre hesapla
    return boyut[0]*4;
}else
        return (boyut[0]+boyut[1])*2 ;// varargsa girilen parametre 1 tane is dikdörtge cevrehesapla
    }

    @Override
    public int alan(int... boyut) {
        if(boyut.length==1) {// varargsa girilen parametre 1 tane ise kare alanı hesaplar.
            return (boyut[0] * boyut[0]);
        }else // varargsa girilen parametre bir tane degilse dkdötgn alan hesaplar
            return (boyut[0]*boyut[1]);
    }

}
