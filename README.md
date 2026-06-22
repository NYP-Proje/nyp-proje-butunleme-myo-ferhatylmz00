[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=24167347&assignment_repo_type=AssignmentRepo)
# Perma Oto Kiralama Otomasyonu

Bu proje, Java Swing kütüphanesi kullanılarak geliştirilmiş bir **Araç Kiralama Otomasyonu** uygulamasıdır. Kullanıcıların sisteme giriş yapmasını, araç listesinden seçim yapmasını, kiralama süresine göre fiyat hesaplamasını ve ödeme işlemlerini gerçekleştirmesini sağlar.

## Özellikler

- **Güvenli Giriş:** "admin" kullanıcı adı ve "1234" şifresi ile sisteme erişim.
- **Araç Seçimi:** Çeşitli marka ve model araçların günlük kiralama ücretleri üzerinden seçim yapma imkanı.
- **Fiyat Hesaplama:** Seçilen araç ve girilen gün sayısı üzerinden toplam tutarın anlık hesaplanması.
- **Ödeme İşlemleri:** Kart bilgileri doğrulaması ile simülasyon ödeme sistemi.
- **Veri Takibi:** Kiralama geçmişinin `ArrayList` yapısında tutulması.

## Kullanılan Teknolojiler

- **Java (Swing):** Grafiksel arayüz (GUI) tasarımı için kullanılmıştır.
- **Java AWT:** Arayüz bileşenlerini düzenlemek için kullanılmıştır.

## Proje Akışı

1. **GirisEkrani:** Uygulama girişi.
2. **AracKiralamaEkrani:** Araç seçimi ve hesaplama ekranı.
3. **OdemeEkrani:** Ödeme bilgilerinin girilmesi ve işlemin tamamlanması.
4. **Veritabani:** Uygulama genelinde kullanıcı ve işlem verilerinin tutulduğu merkez sınıf.

## Kurulum

1. Projeyi bilgisayarınıza klonlayın.
2. Java IDE'nizde (IntelliJ IDEA veya Eclipse) `Main.java` dosyasını çalıştırın.
3. Giriş ekranına `admin` / `1234` bilgilerini girerek uygulamayı kullanmaya başlayabilirsiniz.
