package day39_overriding;

public class OverridingChild_Calısma extends OverridingParent_Calısma{
    public  void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {
        OverridingChild_Calısma obj1 = new OverridingChild_Calısma();
        obj1.method1();  //  Child
        obj1.method2();  //Parent

        OverridingParent_Calısma obj2 = new OverridingChild_Calısma();
        obj2.method2();  //  Parent
        obj2.method1();  //  Child

        OverridingParent_Calısma obj3 = new OverridingParent_Calısma();
        obj3.method2();  //  Parent
        obj3.method1();  //  Parent
    }
}
