# Abstract Factory

Birbiriyle uyumlu nesne ailelerini (burada dağ bisikleti ya da şehir bisikleti parçaları) somut sınıfları
bilmeden üretmeyi anlatır. `FabrikaYaraticisi`, verilen türe göre (`dag_bisikleti`, `sehir_bisikleti`) doğru fabrikayı döndürür.

| Paket | Ne gösterir |
|---|---|
| `ornek1` | Aynı bisikletin kalıp kullanmadan ve soyut fabrikayla oluşturulması; fabrikada her parça için ayrı metot |
| `ornek2` | Genişletilebilir fabrika: tek `olustur(String tip)` metodu ve ortak `BisikletParcalari` türü |
| `ornek3` | Aynı yapı, fabrikanın soyut sınıf yerine arayüz olarak tanımlandığı sürüm |

Çalıştırma: her paketteki `BisikletYapici`.
