# Prototype

Yeni nesneyi baştan kurmak yerine var olan bir nesneyi kopyalayarak (klonlayarak) üretir.

| Paket | Ne gösterir |
|---|---|
| `ornek1` | `Cloneable` ve `super.clone()` ile tavşan klonlama; ilkel alan ve enum kopyalama |
| `ornek2` | Prototipleri bir `Map` içinde tutan `KisiFabrikasi` ile isme göre klon alma |
| `ornek3` | Sığ kopya (shallow copy): klonlanan tavşanın sahibi (`Kisi`) aynı nesne olarak paylaşılır |
| `ornek4` | Derin kopya (deep copy): `clone()` içinde sahip nesnesi de ayrıca klonlanır |

Çalıştırılacak sınıflar: `TavsanKlonlama` (ornek1, 3, 4) ve `KisiKlonloma` (ornek2).
