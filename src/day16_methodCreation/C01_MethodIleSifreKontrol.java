package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {

        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //	- Ilk harf buyuk harf olmali
        //	- Son harf kucuk harf olmali
        //	- Sifre bosluk icermemeli
        //	- Sifre uzunlugu en az 8 karakter olmali

        //bu 4 kontrolu method ile yapın
        String sifre="Aabc123a";

        boolean  ilkHarfKontrol=ilkHarfKontrolEt(sifre);
        boolean sonHarfKontrol=sonHarfKontrolEt(sifre);
        boolean boslukKontrol=boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);

        if(ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }

    }

    public static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }

        return uzunlukKontrolSonuc;
    }

    public static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;

        if (!sifre.contains(" ")){
        boslukKontrolSonuc=true;
    } else {
        System.out.println("sifre bosluk icermemeli");
            boslukKontrolSonuc=false;
    }
        return boslukKontrolSonuc;
    }

    public static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc = false;
        char sonHarf = sifre.charAt(sifre.length() - 1);

        if (sonHarf >= 'a' && sonHarf <= 'z') {
            sonHarfSonuc = true;
        } else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
            sonHarfSonuc = false;

        }
        return sonHarfSonuc;
    }

    public static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;

        if (ilkHarf>= 'A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
            ilkHarfSonuc=false;
        }
        return ilkHarfSonuc;
    }
}
