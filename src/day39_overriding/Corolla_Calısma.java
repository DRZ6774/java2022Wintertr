package day39_overriding;

public class Corolla_Calısma extends Toyota_Calısma {
    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit= "Corolla benzinli veya elektriklidir";
    protected String model="Corolla";

    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");
    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir");
    }

    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {

        Corolla_Calısma arb1=new Corolla_Calısma();
        System.out.println(arb1.hareket); //Araba
        System.out.println(arb1.hiz); //Corolla
        System.out.println(arb1.yakit); //Corolla
        System.out.println(arb1.marka);  //Toyota
        System.out.println(arb1.sirketMerkezi); //Toyata
        System.out.println(arb1.model); //Coralla

        //************METHOD****************
        arb1.motor(); //corolla

        Toyota_Calısma arb2=new Corolla_Calısma();
        System.out.println(arb2.hareket); //Araba
        System.out.println(arb2.hiz); //Toyota
        System.out.println(arb2.yakit); //Araba
        System.out.println(arb2.marka);  //Toyota
        System.out.println(arb2.sirketMerkezi); //Toyata
        //System.out.println(arb2.model); //CTE

        // ************METHOD****************
        arb2.motor(); //corolla
        arb2.garanti(); //toyota
        arb2.yakitTuketimi();//corolla

        Araba_Calısma arb3=new Corolla_Calısma();
        System.out.println(arb3.hareket); //Araba
        System.out.println(arb3.hiz); //Araba
        System.out.println(arb3.yakit); //Araba
        System.out.println(arb3.marka);  //Araba
        //System.out.println(arb2.sirketMerkezi); //Cte
        //System.out.println(arb2.model); //CTE

        //************METHOD****************
        arb3.yakitTuketimi(); // Corolla
        arb3.motor(); //corolla
    }


}
