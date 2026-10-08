package cvprojesi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Kişi nesnesi oluşturuluyor 
        Kisi kisi = new Kisi("Göknur", "Kahraman", "goknur.kahraman@klu.edu.tr", "profil.jpg.jpeg");

        // 2. Hayali iş deneyimlerini tutacak liste oluşturuluyor
        List<IsDeneyimi> deneyimler = new ArrayList<>();

        // 3 farklı iş deneyimi nesnesi üretilip listeye ekleniyor
        deneyimler.add(new IsDeneyimi("Pardus Güvenlik Çözümleri", "Sistem Güvenliği ve Bug Hunting Uzmanı", "2024 - 2025"));
        deneyimler.add(new IsDeneyimi("Huawei Ar-Ge Merkezi", "Yazılım Geliştirme Stajyeri", "2023 - 2024"));
        deneyimler.add(new IsDeneyimi("DENEYAP Teknoloji Atölyeleri", "C Programlama ve Arduino Egitmeni", "2022 - 2023"));

        // 3. PDF Oluşturucu nesnesi yaratılıyor ve PDF üretme metodu çağrılıyor
        CvOlusturucu olusturucu = new CvOlusturucu();
        olusturucu.pdfUret(kisi, deneyimler, "Goknur_Kahraman_CV.pdf");

        // Program bittiğinde oluşturulan kisi, deneyimler ve olusturucu nesneleri
        // bellekten (RAM) silinmek üzere Java'nın Çöp Toplayıcısına (Garbage Collector) devredilir.
    }
}
