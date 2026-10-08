public class Kitap {

    String isbn;
    String ad;
    String yazar;

    public Kitap(String isbn, String ad, String yazar) {
        this.isbn = isbn;
        this.ad = ad;
        this.yazar = yazar;
    }

    public void bilgileriGoster() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Kitap Adı: " + ad);
        System.out.println("Yazar: " + yazar);
    }
}