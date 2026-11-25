# Singleton

Bir sınıftan yalnızca tek bir nesne oluşturulmasını ve bu nesneye her yerden aynı yoldan ulaşılmasını sağlar.
Örneklerde `Util.getInstance().topla(...)` çağrılır.

| Paket | Ne gösterir |
|---|---|
| `ornek1` | Tembel (lazy) oluşturma: nesne ilk `getInstance()` çağrısında yaratılır |
| `ornek2` | `initialized` bayrağıyla yapılan bir deneme; ikinci çağrıda alan hiç atanmadığı için `null` döner, yani neden yanlış olduğunu görmek için bir örnek |
| `ornek3` | Nesneyi sınıf yüklenirken `static final` alanda oluşturma ve `synchronized` erişim |
