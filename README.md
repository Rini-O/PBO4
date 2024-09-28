# 📚 Laporan Pratikum Pemrograman Berorientasi Objek

Selamat datang di laporan pratikum **Pemrograman Berorientasi Objek**! 🎉😄

## 📖 Deskripsi

Laporan ini menjelaskan konsep dasar CRUD dan penanganan kesalahan dalam pemrograman menggunakan teknik **Try Catch**, **Throws**, dan **Custom Exception**. 💻✨

## 🔍 Penjelasan

### 1. CRUD (Create, Read, Update, Delete) 🛠️

CRUD adalah singkatan dari empat operasi dasar yang dapat dilakukan pada data:

- **Create**: Menambahkan data baru ke dalam sistem. 🆕
- **Read**: Mengambil dan menampilkan data yang ada. 👀
- **Update**: Memperbarui data yang sudah ada. 🔄
- **Delete**: Menghapus data yang tidak diperlukan. ❌

 Implementasi CRUD :
  - `tambah()`: Menambahkan data mahasiswa ke dalam database.
  - `tampil()`: Menampilkan semua data mahasiswa dari database.
  - `hapus()`: Menghapus data mahasiswa berdasarkan NIM.
  - `update()`: Memperbarui data mahasiswa berdasarkan NIM.
  - `menu()`: Menampilkan menu utama dan mengarahkan ke metode yang sesuai.

### 2. Try Catch 🛡️

**Try Catch** adalah struktur yang digunakan untuk menangani pengecualian dalam program. Dengan menggunakan `try`, kita dapat mencoba mengeksekusi kode yang mungkin menghasilkan kesalahan, dan dengan `catch`, kita dapat menangani kesalahan tersebut.

Implermentasi Try Catch :
- kelas `TryCatch1` berisi metodh `main` dan metode `multiply`.
- Dalam metode `main`, digunakan untuk memasukkan dua angka.
- Blok `try-catch` digunakan untuk menangani kesalahan input dan kondisi aritmatika.

Pada method 'multiply' memeriksa apakah hasil perkalian akan melebihi Integer.MAX_VALUE . jika hasil perkalian melebihi batas, maka program akan melempar ArithmeticException, untuk memberitahu bahwa hasil perkalian terlalu besar.

### 3. Throws 🚀
Kata kunci throws digunakan dalam deklarasi metodh. untuk menunjukkan bahwa metodh tersebut dapat melempar pengecualian tertentu. Ini memungkinkan pemanggil metode untuk menangani pengecualian tersebut ⚠️

Implementasi Throws :
- **Kelas `Throws`** berisi metode `checknilai` untuk memeriksa nilai dan metode `main` untuk menjalankan program.
- **Metode `checknilai`** dilakukan dengan Menggunakan `throws` untuk menyatakan bahwa metodh ini dapat melempar `ArithmeticException` jika nilai yang diberikan kurang dari 70.
  - Jika nilai kurang dari 70, maka program melempar `ArithmeticException` dengan mencetak pesan "nilai tidak memenuhi kkm".
  - Jika nilai memenuhi kriteria, program mencetak pesan "nilai mencukupi".

 ### 4. Custom Exception 🎭
Custom Exception adalah pengecualian yang dibuat oleh pengguna untuk menangani kondisi khusus dalam aplikasi. Dengan membuat kelas pengecualian sendiri, kita dapat memberikan informasi yang lebih spesifik tentang kesalahan yang terjadi 🧩

## 📝 Kesimpulan
Dalam laporan ini, membahas konsep dasar pemrograman berorientasi objek, khususnya terkait dengan operasi CRUD, penanganan kesalahan menggunakan Try Catch, serta penggunaan Throws dan Custom Exception. Memahami konsep-konsep ini sangat penting untuk membangun aplikasi yang robust dan dapat menangani berbagai kondisi kesalahan dengan baik. Dengan penerapan teknik-teknik ini, pengembangan perangkat lunak menjadi lebih terstruktur dan efisien. 🌟

Terima kasih telah membaca laporan ini! Semoga bermanfaat! 🎉
