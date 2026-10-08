package cvprojesi;

public class Kisi {
    // Özellikler private yapılarak dışarıdan doğrudan erişim kapatıldı (Encapsulation)
    private String ad;
    private String soyad;
    private String email;
    private String fotografYolu;

    // Nesne oluşturulurken ilk değerleri atayan Yapıcı Metot (Constructor)
    public Kisi(String ad, String soyad, String email, String fotografYolu) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.fotografYolu = fotografYolu;
    }

    // Getter ve Setter Metotları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFotografYolu() {
        return fotografYolu;
    }

    public void setFotografYolu(String fotografYolu) {
        this.fotografYolu = fotografYolu;
    }
}