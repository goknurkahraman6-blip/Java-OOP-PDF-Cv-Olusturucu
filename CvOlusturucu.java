package cvprojesi;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CvOlusturucu {

    public void pdfUret(Kisi kisi, List<IsDeneyimi> deneyimler, String dosyaAdi) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(dosyaAdi));
            document.open();

            
            try {
                Image img = Image.getInstance(kisi.getFotografYolu());
                img.scaleAbsolute(100f, 100f);
                img.setAbsolutePosition(450f, 700f); // Sağ üst köşe koordinatları
                document.add(img);
            } catch (Exception e) {
                document.add(new Paragraph("[Fotograf bulunamadi: " + kisi.getFotografYolu() + "]"));
            }

            // KİŞİSEL BİLGİLER
            document.add(new Paragraph("Kisisel Bilgiler"));
            document.add(new Paragraph("--------------------------------------------------"));
            document.add(new Paragraph("Ad Soyad: " + kisi.getAd() + " " + kisi.getSoyad()));
            document.add(new Paragraph("E-posta: " + kisi.getEmail()));

            
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));

            //  İŞ DENEYİMLERİ
            document.add(new Paragraph("Is Deneyimleri"));
            document.add(new Paragraph("--------------------------------------------------"));

            for (IsDeneyimi deneyim : deneyimler) {
                document.add(new Paragraph("- " + deneyim.getPozisyon() + " | " + deneyim.getSirketAdi() + " (" + deneyim.getCalismaYillari() + ")"));
            }

            document.close();
            System.out.println("Harika! PDF basariyla olusturuldu: " + dosyaAdi);

        } catch (DocumentException | IOException e) {
            System.err.println("PDF olusturulurken bir hata meydana geldi: " + e.getMessage());
        }
    }
}
