package day45_İnterface;

public interface I01_Default_Static_Calısma {

    void method1();

   public default void method2(){

       System.out.println("İnterface deki defoult method2");

    }

    static void method3(){

    }


}
