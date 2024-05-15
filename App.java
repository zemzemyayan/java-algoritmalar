package JavaGeeksForGeeks;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // String x = "011011";
        // String y = "1010111";
        String metin = "merhaba";
        // System.out.println(add_Binary(x, y));
        // System.out.println(neonSayiMi(8));
        // verilenarAraliktakiNeonSayilar(1, 20);
        // System.out.println( unluHarfMi('r'));
        int us = unluHarfKadarKuvvetAlma(3, metin);
        System.out.println(us);
    }

    // iki ikili dize eklemek için java programı
    public static String add_Binary(String x, String y) {
        int num1 = Integer.parseInt(x, 2);// parseInt verilen stringi 2'lik number degere dönüştürür
        int num2 = Integer.parseInt(y, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);// sum dizesinin temsilini işaretsiz bir tamsayı olarak döner
        return result;
    }

    public static String add_Binary2(String x, String y) {

        int i = x.length() - 1, j = y.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += x.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += y.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                result.append("0");
                carry = 1;
            } else if (sum == 2) {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }

        if (carry == 1) {
            result.append("1");
        }
        return result.reverse().toString();

    }

    public static int basamakSayisi(int sayi) {
        int sayac = 1;
        do {
            ;
            sayi = sayi / 10;
            sayac++;
        } while (sayi > 9);
        return sayac;
    }

    public static ArrayList<Integer> basamakdegerleri(int sayi) {
        ArrayList<Integer> basamakDegerleriList = new ArrayList<>();
        // oncelikle sayının basaamak degerlerini bir listede tutalım
        do {
            basamakDegerleriList.add(sayi % 10);
            sayi = sayi / 10;
        } while (sayi > 1);
        return basamakDegerleriList;
    }

    // verilen sayının neon sayı olup olmadıgını bulan program
    public static boolean neonSayiMi(int sayi) {
        boolean state = false;
        int sayiKare = sayi * sayi;

        int n = basamakSayisi(sayiKare);
        int toplam = 0;
        for (int i = 0; i < n; i++) {
            toplam = toplam + (sayiKare % 10);
            sayiKare = sayiKare / 10;
        }

        if (toplam == sayi)
            state = true;

        return state;
    }

    // verilen bir aralıktaki neon sayıları yazdıran program
    public static void verilenarAraliktakiNeonSayilar(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (neonSayiMi(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean unluHarfMi(char karakter) {
        char[] unluHarfler = { 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü' };
        boolean state = false;
        for (int i = 0; i < unluHarfler.length; i++) {
            if (karakter == unluHarfler[i]) {
                state = true;
            }
        }
        return state;
    }

    // girilen stringdeki unlu harf sayısı kadar belirlenen rakamın kuvettini alan
    // program
    public static int unluHarfKadarKuvvetAlma(int deger, String metin) {
        // once stringin her bir harfini unluharfmi fonksiyonuna atayalım
        // fonksiyondan gelen deger true oldugu sürece sayacı arttıtalım sonucta degrin
        // sayac kuvvetini al
        for (int i = 0; i < metin.length(); i++) {
            if (unluHarfMi(metin.charAt(i))) {
                deger = deger * deger;
            }
        }

        return deger;
    }

}
