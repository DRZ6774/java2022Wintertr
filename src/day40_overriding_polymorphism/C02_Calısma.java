package day40_overriding_polymorphism;

public class C02_Calısma extends C01_Calısma {

    @Override
    public void method2() {
        System.out.println("child method2");
    }

    public static void main(String[] args) {

        C02_Calısma obj1=new C02_Calısma();

        obj1.method1();  //parent method1
        obj1.method2();  //child method2

        C01_Calısma obj2=new C02_Calısma();

        obj2.method1();  //parent method1
        obj2.method2();  //child method2


        C01_Calısma obj3=new C01_Calısma();

        obj3.method1();  //parent method1
        obj3.method2();  //parent method2
    }

}
