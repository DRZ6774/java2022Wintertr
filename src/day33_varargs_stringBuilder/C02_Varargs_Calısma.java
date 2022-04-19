package day33_varargs_stringBuilder;

public class C02_Varargs_Calısma {
    public static void main(String[] args) {

        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";

        carpim(sayi, str1, str2);


    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr = "";

        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }
        System.out.println(enUzunStr.length()*sayi);
    }
}
