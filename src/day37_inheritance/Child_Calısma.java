package day37_inheritance;

import day36_inheritance.Parent_Calısma;

public class Child_Calısma extends Parent_Calısma {

    Child_Calısma(){

        super();
        System.out.println("child clas parametresiz cons");
    }

    Child_Calısma(int s){
        System.out.println("Child class parametreli cons");
    }

    Child_Calısma(int sayi1,int sayi2){
        super(sayi1,sayi2);

        System.out.println("iki parametreli cons");
    }

    public static void main(String[] args) {

        Child_Calısma child = new Child_Calısma(5,8);

    }

}
