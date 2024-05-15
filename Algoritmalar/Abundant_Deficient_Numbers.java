package AlgoritmalarPdf;

public class Abundant_Deficient_Numbers {
    public static void main(String[] args) {

        // System.out.println(abundantOrDeficient_Number(17));
        // int[] dizi = { 13, 14, 19, 17, 18, 21, 22, 23, 24 };
        // abundantOrDeficient_Numbers(dizi);
        // -> .1'den 63'e kadar olan sayılar arasında istenilen sayıyı maksimum 6
        // seferde bulan program
        // !Bu soru, matematik (algoritma) olimpiyatlarında sorulmuş bir sorudur

    }

    // ?guclu sayı:Kendisi hariç pozitif tam sayı bölenlerinin toplamı kendisinden
    // ?büyük olan sayılara zengin (abundant) sayı denir
    // ?deficient number:n pozitif bir tamsayı olmak üzere, n sayısının pozitif
    // bölenlerinin toplamı
    // ?σ(n)’dir.Şâyet,σ(n) < 2n ise, n kıt bir sayıdır

    // -> girilen sayının zayıf sa 0 gucluyse 1 ikiside değilse 2 degerini donen kod
    public static char abundantOrDeficient_Number(int deger) {
        int toplam = 0;
        char ch;
        for (int i = 1; i < deger; i++) {
            if (deger % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam > deger) {
            ch = '1';// eger sayı guclu ise ch=1
        } else if (toplam < (2 * deger)) {
            ch = '0'; // eger sayı zayıf sayı ise ch=0
        } else {
            ch = '2';// eger sayı zayıf ya da guclu degilse ch=2
        }

        return ch;
    }

    // -> girilen dizideki elemanlardan guclu ve zayıf olanları ve bunların
    // birbirien
    // olan oranına göre dizinin guclu ya da zayıf oldugunu söyleyen kod
    public static void abundantOrDeficient_Numbers(int[] dizi) {
        char ch;
        int guclusayac = 1;
        int zayifSayac = 1;
        for (int i = 0; i < dizi.length; i++) {
            ch = abundantOrDeficient_Number(dizi[i]);
            if (ch == '1') {
                System.out.println(dizi[i] + " -> Guclu Sayi ");
                guclusayac++;
            } else if (ch == '0') {
                System.out.println(dizi[i] + " -> Zayif Sayi ");
                zayifSayac++;
            } else if (ch == '2') {
                System.out.println(dizi[i] + " -> ne Guclu ne de Zayif sayidir ");
            }
        }

        if ((guclusayac / zayifSayac) > 1) {
            System.out.println("girilen dizi guclu bir karakteristik ozelliktedir ");
        }

        else if ((zayifSayac / guclusayac) > 1) {
            System.out.println("girilen dizi zayif bir karakteristik ozelliktedir ");
        } else if ((guclusayac / zayifSayac) == 1) {
            System.out.println("dizinin bir karakteristigi yoktur .");
        }
    }

    // -> .1'den 63'e kadar olan sayılar arasında istenilen sayıyı maksimum 6
    // seferde bulan program
    // !Bu soru, matematik (algoritma) olimpiyatlarında sorulmuş bir sorudur

}
