package day33_varargs_stringBuilder;

public class C04_StringBuilder_Calısma {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Yasasın java");

        System.out.println(sb1.indexOf("java")); //8

        System.out.println(sb1.lastIndexOf("s"));//4 en sondaki s

        System.out.println(sb1.indexOf("s")); //2 en bastaki s

        System.out.println(sb1.replace(0,7,"Ne güzel"));  //Ne güzel java

        System.out.println(sb1);  // Ne güzel java mutable oldugu için degistirdi

        System.out.println(sb1.toString().toUpperCase()); //NE GÜZEL JAVA

        System.out.println(sb1);  //Ne güzel java  toString string methodlarını kullandırdı immutable ye döndu ve degiştirmedi

        System.out.println(sb1.delete(0,4));    //üzel java


        System.out.println(sb1.deleteCharAt(0));  //zel java






    }
}
