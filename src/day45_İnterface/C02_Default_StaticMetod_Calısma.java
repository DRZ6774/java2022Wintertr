package day45_İnterface;

public class C02_Default_StaticMetod_Calısma implements I01_Default_Static {


    @Override
    public void metod1() {
        System.out.println("child clas method1");
    }

    public static void main(String[] args) {

        I01_Default_Static.metod3();

        C02_Default_StaticMetod obj=new C02_Default_StaticMetod();

        obj.metod1();
        obj.metod2();

        //bj.metod3(); hata verir

    }
}
