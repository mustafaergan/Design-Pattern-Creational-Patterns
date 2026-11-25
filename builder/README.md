# Builder

Çok parçalı bir nesneyi adım adım kurmayı, kurma sürecini nesnenin kendisinden ayırarak anlatır.

| Paket | Ne gösterir |
|---|---|
| `ornek1` | Klasik Builder: `Garson` (yönetici) hamur, sos ve malzeme adımlarını `ItalyanPizzaBuilder` ya da `TurkPizzaBuilder` ile uygular. Çalıştırma: `PizzaBuilderTest` |
| `ornek2` | Akıcı (fluent) kurucu: `YatakOdasiBuilder` ile isteğe bağlı alanları zincirleme ayarlayıp `createYatakOdasi()` çağırma; ortak `Builder` arayüzü ve `MutfakBuilder`. Çalıştırma: `Mimar` |
