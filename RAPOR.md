# Rapor

**Ad Soyad:** Betül Beril Yücel
**Numara:** 684

## 1. Problem Analizi
<!-- Problemi kendi cümlelerinizle yazın. --> neti hesaplayip boş sayısını bulup başarıyı derecelendirmek


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
- doğru ve yanlış sayısı

**İşlemler:**
- doğru-(yanlış/dört) ve boş içinse 20-(doğru+yanlış) ve başarı derecelendirmesi

**Çıktılar:**
- net boş sayisi ve başarı durumu

## 3. Matematiksel Formüller

- d-(y/4.0) ve 20-(d+y)

## 4. Sözde Kod (Pseudocode)

```
1. doğruyu ve yanlışı okudu
2. işlemleri yaptı
3. neti ve bos sayısını  ve basarıyı yazdı
```

## 5. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 6. Başarı Durumu Koşulları
<!-- Koşulları hangi sırayla ve hangi operatörlerle yazdığınızı, nedenini açıklayın. --> if else ve else if ile yazdim çünkü bu şekilde başarı 3 duuma ayrılabilecekti ilk başta net>15 sonra net


## 7. Test Sonuçları

| Doğru | Yanlış | Beklenen | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 20 | 0 | Net 20, Çok iyi | | |
| 15 | 4 | Net 14, İyi | | |
| 10 | 8 | Net 8, Orta | | |
| 5 | 0 | Net 5, Geliştirilmeli | | |
| 0 | 20 | Net -5, Geliştirilmeli | | |
| 10 | 10 | Net 7,5, Orta | | |
| 15 | 10 | Geçersiz giriş | | |
| 12 | 9 | Geçersiz giriş | | |
| -1 | 5 | Geçersiz giriş | | |
