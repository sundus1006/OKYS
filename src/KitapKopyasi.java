public class KitapKopyasi {

    int kopyaNo;
    boolean mevcut;

    public KitapKopyasi(int kopyaNo) {
        this.kopyaNo = kopyaNo;
        this.mevcut = true;
    }

    public void oduncVer() {
        mevcut = false;
    }

    public void iadeEt() {
        mevcut = true;
    }
}