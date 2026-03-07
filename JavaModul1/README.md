# 4 pilar *Object Oriented Programming* (OOP)
4 pilar pada OOP merupakan dasar dalam pengembangan *software* yang diciptakan untuk membantu menulis kode yang tampak bersih (*clean code*):

### 1. Enkapsulasi (Encapsulation)

**Enkapsulasi** adalah cara kita membungkus data (variabel) dan metode (fungsi) menjadi satu unit tunggal yang disebut **Class**. Tujuannya adalah untuk menyembunyikan detail internal dari dunia luar.

* **Intinya:** "Jangan sentuh isi dalam saya sembarangan."
* **Contoh:** Seperti sebuah kapsul obat. Kamu hanya perlu menelan kapsulnya tanpa perlu tahu detail kimia di dalamnya. Kamu berinteraksi dengan objek hanya melalui "pintu" (metode) yang sudah disediakan.

### 2. Abstraksi (Abstraction)

**Abstraksi** adalah teknik untuk menyembunyikan detail implementasi yang rumit dan hanya menampilkan fungsi-fungsi pentingnya saja kepada pengguna.

* **Intinya:** "Tahu cara pakainya, bukan cara kerjanya."
* **Contoh:** Saat kamu menyetir mobil, kamu hanya perlu tahu cara menginjak pedal gas dan rem. Kamu tidak perlu tahu bagaimana sistem pembakaran mesin bekerja di bawah kap setiap kali kamu menekan pedal.

### 3. Pewarisan (Inheritance)

**Inheritance** memungkinkan sebuah Class (disebut *Child Class*) untuk mewarisi sifat, atribut, dan perilaku dari Class lain (disebut *Parent Class*). Ini sangat berguna untuk mencegah penulisan kode yang berulang.

* **Intinya:** "Apa yang bapak punya, anak juga punya."
* **Contoh:** Jika kita punya Class **Hewan**, maka Class **Kucing** dan **Anjing** bisa mewarisi sifat "Bernapas" dan "Makan" dari Class Hewan, tapi tetap bisa punya sifat uniknya sendiri seperti "Mengeong" atau "Menggonggong".

### 4. Polimorfisme (Polymorphism)

**Polimorfisme** berasal dari bahasa Yunani yang berarti "banyak bentuk". Ini memungkinkan satu metode atau fungsi memiliki perilaku yang berbeda-beda tergantung pada objek yang memanggilnya.

* **Intinya:** "Satu perintah, banyak cara melakukan."
* **Contoh:** Bayangkan perintah "Bersuara". Jika diberikan kepada Kucing, ia akan "Meong". Jika diberikan kepada Anjing, ia akan "Guk". Perintahnya sama, tapi hasilnya berbeda sesuai identitas objeknya.

