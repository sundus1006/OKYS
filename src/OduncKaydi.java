public class OduncKaydi {

    Kullanici kullanici;
    KitapKopyasi kitapKopyasi;
    String tarih;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kitapKopyasi, String tarih) {
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.tarih = tarih;
    }

    public void bilgileriGoster() {
        System.out.println("Kullanici: " + kullanici.ad);
        System.out.println("Kopya No: " + kitapKopyasi.kopyaNo);
        System.out.println("Tarih: " + tarih);
    }
}