package JavaGeeksForGeeks;

import java.util.ArrayList;

public class AmstrongSayiBulanProgram {
    public static void main(String[] args) {
        amstrongSayimi(153);

    }

    /* İki Tam Sayı Arasındaki Armstrong Sayısını Kontrol Eden Java Programı */
    // !NOT AŞAĞIDAKİ KOD INDEXOUTPUTOF EXCEPTİONU FIRLATIYOR KODA TEKRAR BAK
    // Amstrong sayı : sayının basamak sayisi=n olsun her bir basamagının
    // n.dereceden kuvvetinin
    // toplami sayıya esitse sayı Amstrong sayı olmus oluyor
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

    // ArrayList<Integer> tipinde bir fonksiyon tanımlandı
    public static void amstrongSayimi(int sayi) {

        int toplam = 0;
        // basamak sayisi=n olsun her bir basamagının n.dereced kuvveti alınıp
        // toplanıcak ne defa
        for (int i = 0; i <= basamakSayisi(sayi); i++) {
            toplam = toplam + (basamakdegerleri(sayi).get(i) ^ basamakSayisi(sayi));
        }
        if (toplam == sayi) {
            System.out.println(sayi + " sayisi bir Amstrong sayidir ");
        } else {
            System.out.println(sayi + " sayisi bir Amstrong sayi degildir .");
        }

    }

}
