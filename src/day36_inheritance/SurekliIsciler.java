package day36_inheritance;

public class SurekliIsciler extends Isci {
    public static void main(String[] args) {

        SurekliIsciler surIc1=new SurekliIsciler();
        surIc1.personelno=5001;
        surIc1.personelisim="Cem";
        surIc1.personelsoyisim="Akay";
        surIc1.statü="Isci";
        surIc1.saatücreti=11;
        surIc1.maas=surIc1.maashesapla();

        System.out.println(surIc1);
    }

    @Override
    public String toString() {
        return "SurekliIsciler{" +
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
