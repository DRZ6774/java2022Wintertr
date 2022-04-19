package day36_inheritance;

public class Ustabası extends Isci {
    public static void main(String[] args) {

        Ustabası ustabası = new Ustabası();
        ustabası.saatücreti=15;
        ustabası.personelisim="Murat";
        ustabası.personelsoyisim="Göcek";
        ustabası.maas=ustabası.maashesapla();
        ustabası.statü="Isci";
        ustabası.isciStatu="Ustabası";

        System.out.println(ustabası);


    }

    @Override
    public String toString() {
        return "Ustabası{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatücreti=" + saatücreti +
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
