package day36_inheritance;

public class Muhasebe extends Personel{

    protected int saatücreti;
    protected String statü;
    protected int maas;

    protected int maashesapla(){
        int maas = saatücreti*8*30;
        return maas;
    }

}
