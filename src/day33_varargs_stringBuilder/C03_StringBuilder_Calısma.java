package day33_varargs_stringBuilder;

public class C03_StringBuilder_Calısma {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java cok guzel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 lenght"+sb1.length());  //sb1 lenght0
        System.out.println("sb1 capacity"+sb1.capacity());     //sb1 capacity16

        System.out.println("sb2 lenght"+sb2.length());  //sb2 lenght14
        System.out.println("sb2 capacity"+sb2.capacity());     //sb2 capacity30

        System.out.println("sb3 lenght"+sb3.length());  //sb3 lenght0
        System.out.println("sb3 capacity"+sb3.capacity());     //sb3 capacity10


        sb1.append("Java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println("sb1 lenght"+sb1.length());  //14
        System.out.println("sb1 capacity"+sb1.capacity());     //16

        sb1.append(3);
        System.out.println(sb1); //Java cok guzel3
        sb1.append(true);
        System.out.println(sb1);//Java cok guzel3true

        System.out.println("sb1 lenght"+sb1.length());  //19
        System.out.println("sb1 capacity"+sb1.capacity());     //34

        sb1.trimToSize();
        System.out.println("sb1 lenght"+sb1.length());  //19
        System.out.println("sb1 capacity"+sb1.capacity());     //19
    }
}
