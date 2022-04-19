package day36_inheritance;

public class Memur extends Muhasebe{


    public static void main(String[] args) {

        Memur objMemur = new Memur();
        objMemur.personelno=1001;
        objMemur.personelisim="Ahmet";
        objMemur.personelsoyisim="Tepecik";
        objMemur.personeladres="Ankara";
        objMemur.personeltel="1234567890";

        objMemur.saatücreti=10;
        objMemur.maas=objMemur.maashesapla();
        objMemur.statü="Memur";

        System.out.println(objMemur);

        Memur objMemur2=new Memur();
        objMemur2.personelno=1002;
        objMemur2.saatücreti=10;
        objMemur2.maas= objMemur2.maashesapla();
        objMemur2.statü="Memur";

        System.out.println(objMemur2);


    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatücreti=" + saatücreti +
                ", statü='" + statü + '\'' +
                ", maas=" + maas +
                ", personelno=" + personelno +
                ", personelisim='" + personelisim + '\'' +
                ", personelsoyisim='" + personelsoyisim + '\'' +
                ", personeladres='" + personeladres + '\'' +
                ", personeltel='" + personeltel + '\'' +
                '}';
    }
}
