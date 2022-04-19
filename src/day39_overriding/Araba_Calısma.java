package day39_overriding;

public class Araba_Calısma {
    String hareket="Arabalar teker ile hareket eder";
    String  hiz="Arabalar motor gücüne göre hız yapar";
    String yakit="Arabalar farklı yakıt kullanabilir";
    String marka="Arabalar uretildikleri markaya sahiptir";

    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    public void yakitTuketimi(){
        System.out.println("arabalar motor gucu ve yakit turune gore yakit tuketirler");
    }
}
