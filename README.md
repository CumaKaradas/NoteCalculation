# Not Hesaplama Sistemi

Bu Java programı, öğrencilerin vize, final ve proje notlarını kullanarak dönem sonu not ortalamasını ve harf notunu hesaplar. Program, farklı değerlendirme kriterlerine göre ağırlıklı ortalama hesaplayıp, uygun harf notunu belirler.

## Özellikler

- Vize (30%), Final (50%) ve Proje (20%) notlarını alır
- Ağırlıklı not ortalamasını hesaplar
- Harf notunu belirler (AA'dan FF'ye)
- Ondalıklı not girişini destekler

## Değerlendirme Kriterleri

| Not Aralığı | Harf Notu |
|-------------|-----------|
| 90-100      | AA        |
| 85-89       | BA        |
| 80-84       | BB        |
| 75-79       | CB        |
| 70-74       | CC        |
| 65-69       | DC        |
| 60-64       | DD        |
| 55-59       | FD        |
| 0-54        | FF        |

## Gereksinimler

- Java JDK 8 veya üzeri
- Herhangi bir Java IDE'si (Eclipse, IntelliJ IDEA, VS Code vb.)

## Kurulum

1. Projeyi bilgisayarınıza indirin:
```bash
git clone https://github.com/kullaniciadi/NotHesaplama.git
```

2. Proje dizinine gidin:
```bash
cd NotHesaplama
```

3. Java dosyasını derleyin:
```bash
javac NotHesaplama.java
```

4. Programı çalıştırın:
```bash
java NotHesaplama
```

## Kullanım

1. Program başlatıldığında vize notunu girin (0-100 arası)
2. Final notunu girin (0-100 arası)
3. Proje notunu girin (0-100 arası)
4. Program otomatik olarak ortalamayı ve harf notunu hesaplayacaktır

Örnek kullanım:
```
Vize notunu giriniz: 
85
Final notunu giriniz: 
90
Proje notunu giriniz: 
95
Not Ortalaması: 89.5
Harf Notu: BA
```

## Not Hesaplama Formülü

```
Not Ortalaması = (Vize × 0.3) + (Final × 0.5) + (Proje × 0.2)
```

## Planlanan Geliştirmeler

- [ ] Not girişi için aralık kontrolü (0-100)
- [ ] Birden fazla öğrenci için toplu hesaplama
- [ ] Sınıf ortalaması hesaplama
- [ ] Başarı durumu analizi
- [ ] Grafik arayüz ekleme
- [ ] Notları dosyaya kaydetme özelliği
- [ ] İstatistiksel analiz raporları
- [ ] Geçme/Kalma durumu kontrolü

## Notlar

- Program 100'lük sistemde notlar üzerinden çalışır
- Ondalıklı sayılar için nokta (.) kullanılmalıdır
- Negatif not girişi program tarafından kontrol edilmemektedir

## Katkıda Bulunma

1. Bu projeyi fork edin
2. Yeni bir branch oluşturun (`git checkout -b yeni-ozellik`)
3. Değişikliklerinizi commit edin (`git commit -m 'Yeni özellik eklendi'`)
4. Branch'inizi push edin (`git push origin yeni-ozellik`)
5. Pull Request oluşturun

## Hata Raporlama

Herhangi bir hata veya öneriniz için:
1. Issues sekmesinden yeni bir issue oluşturun
2. Hatanın detaylı açıklamasını yazın
3. Varsa hata mesajının ekran görüntüsünü ekleyin
