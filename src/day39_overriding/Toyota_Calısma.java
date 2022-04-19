package day39_overriding;

public class Toyota_Calısma extends Araba_Calısma {

    String hiz="Toyota araclar max 220 km hiz yapar";
    String marka="Toyota";
    String sirketMerkezi="Japonya";


    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanir");
    }

    public void garanti(){
        System.out.println("Toyata araclar 10 yil garantilidir");
    }
}



