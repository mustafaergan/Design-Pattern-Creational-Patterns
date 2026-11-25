# Tasarım Kalıpları: Yaratımsal Kalıplar (Creational Patterns)

Yaratımsal tasarım kalıplarını (Singleton, Prototype, Builder, Abstract Factory) Türkçe isimli, küçük ve
adım adım gelişen Java örnekleriyle anlatan ders deposu.

> **Not:** Bu depo 2018 yılında eğitim amaçlı yazıldı ve artık güncellenmiyor.

## İçerik

Her klasör ayrı bir kalıbı anlatır; `ornek1`, `ornek2`... paketleri bir öncekini geliştiren örneklerdir.
Ayrıntılar klasörlerdeki `README.md` dosyalarında.

| Klasör | Kalıp | Örnekler |
|---|---|---|
| `singleton` | Singleton | Tembel (lazy) oluşturma, hatalı bir bayrak denemesi, `final` alan ve `synchronized` ile güvenli sürüm |
| `prototype` | Prototype | `Cloneable` ile tavşan klonlama, prototip kayıt fabrikası, sığ ve derin kopya farkı |
| `builder` | Builder | Garson ve pizza yapıcıları (klasik Builder), akıcı (fluent) `YatakOdasiBuilder` |
| `abstractfactory` | Abstract Factory | Dağ ve şehir bisikleti parça fabrikaları; kalıpsız ve kalıplı kullanım, genişletilebilir fabrika |

## Teknolojiler

- Saf Java (Java 7 ve üzeri), harici bağımlılık ve derleme dosyası yok

## Çalıştırma

Her klasör ayrı bir proje olarak düşünülmüştür (`<klasör>/src` kaynak klasörü). IDE'de klasörü açıp `src`'yi
kaynak klasörü olarak işaretleyin ve `main` metodu olan sınıfı çalıştırın. Komut satırından örneğin:

```bash
cd prototype
javac -d out $(find src -name "*.java")
java -cp out com.mustafaergan.ornek4.TavsanKlonlama
```

`main` metodu olan sınıflar: `singleton/.../Main`, `prototype/.../TavsanKlonlama` ve `KisiKlonloma`,
`builder/.../PizzaBuilderTest` ve `Mimar`, `abstractfactory/.../BisikletYapici`.
