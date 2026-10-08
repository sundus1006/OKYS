public class Main {

    public static void main(String[] args) {

        Kitap kitap = new Kitap("978-1234567890", "Java Programlama", "Ahmet Yılmaz");

        KitapKopyasi kopya = new KitapKopyasi(1);

        Kullanici kullanici = new Kullanici(101, "Sündüz", "sunduz@example.com");

        OduncKaydi kayit = new OduncKaydi(
                kullanici,
                kopya,
                "08.10.2026"
        );

        kitap.bilgileriGoster();

        System.out.println("Kopya No: " + kopya.kopyaNo);
        System.out.println("Mevcut mu: " + kopya.mevcut);

        kayit.bilgileriGoster();

        kopya.oduncVer();

        System.out.println("Ödünç verildikten sonra mevcut mu: " + kopya.mevcut);
    }
}