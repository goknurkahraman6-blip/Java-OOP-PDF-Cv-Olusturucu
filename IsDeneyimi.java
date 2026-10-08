package cvprojesi;

public class IsDeneyimi {
    private String sirketAdi;
    private String pozisyon;
    private String calismaYillari;

    public IsDeneyimi(String sirketAdi, String pozisyon, String calismaYillari) {
        this.sirketAdi = sirketAdi;
        this.pozisyon = pozisyon;
        this.calismaYillari = calismaYillari;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public String getCalismaYillari() {
        return calismaYillari;
    }
}