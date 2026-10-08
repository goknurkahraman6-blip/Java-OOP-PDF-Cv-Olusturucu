# Java-OOP-PDF-Cv-Olusturucu
# Java Nesne Yönelimli Programlama - CV Oluşturucu

Bu proje, Java'da Nesne Yönelimli Programlama (OOP) prensipleri kullanılarak tasarlanmış, konsol üzerinden çalışan ve çıktı olarak PDF formatında bir özgeçmiş (CV) üreten bir uygulamadır.

## Kullanılan Bileşenler, Nesneler ve Kullanım Nedenleri

Projede modüler bir yapı kurabilmek ve kapsülleme (encapsulation) kuralına uymak amacıyla işlemler tek bir `Main` metodu içine yazılmamış, farklı sınıflara (class) bölünmüştür.

* **`Kisi` Sınıfı:** Özgeçmişi oluşturulacak kişinin kişisel bilgilerini (ad, soyad, e-posta, fotoğraf yolu) tutmak için kullanıldı. Veri güvenliğini sağlamak için özellikler `private` tanımlandı ve bunlara erişim `getter/setter` metotlarıyla sağlandı.

  
* **`IsDeneyimi` Sınıfı:** İstenilen hayali 3 iş deneyimini yapısal bir formatta (şirket adı, pozisyon, çalışma yılları) tutabilmek için şablon olarak kullanıldı. Bu sınıftan 3 farklı nesne türetilerek bir liste (ArrayList) içine eklendi.

  
* **`CvOlusturucu` Sınıfı:** PDF oluşturma işleminin ana sınıftan bağımsız olması için özel olarak tasarlandı. Kodun okunabilirliğini ve yönetilebilirliğini artırmak amacıyla, iText kütüphanesi fonksiyonları bu sınıf içinde çalıştırıldı.

  
* **`Main` Sınıfı:** Uygulamanın başlangıç noktasıdır. Nesnelerin yaşam döngüsünü (lifecycle) başlatmak, türetmek ve PDF üretici sınıfı çağırmak amacıyla kullanıldı.

  
* **`iText` Kütüphanesi (v5.5.13.3):** Java'nın standart kütüphanelerinde PDF üretme yeteneği bulunmadığı için, belge oluşturmak, paragraflar eklemek ve fotoğrafı sağ üst köşeye mutlak (absolute) olarak hizalamak amacıyla bu dış kütüphane tercih edildi. Projeye bağımlılık (dependency) olarak Maven `pom.xml` üzerinden dahil edildi.
