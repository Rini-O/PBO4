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

Contoh implementasi CRUD dalam pemrograman berorientasi objek dapat dilihat pada kelas `DataMahasiswa`.

### 2. Try Catch 🛡️

**Try Catch** adalah struktur yang digunakan untuk menangani pengecualian dalam program. Dengan menggunakan `try`, kita dapat mencoba mengeksekusi kode yang mungkin menghasilkan kesalahan, dan dengan `catch`, kita dapat menangani kesalahan tersebut.

Contoh :
try {
    // Kode yang mungkin menyebabkan kesalahan
} catch (Exception e) {
    // Penanganan kesalahan
}

### 3. Throws 🚀
Kata kunci throws digunakan dalam deklarasi metode untuk menunjukkan bahwa metode tersebut dapat melempar pengecualian tertentu. Ini memungkinkan pemanggil metode untuk menangani pengecualian tersebut ⚠️

Contoh :
public void metode() throws AritmethicException {
    // Kode yang dapat melempar IOException
}

 ### 4. Custom Exception 🎭
Custom Exception adalah pengecualian yang dibuat oleh pengguna untuk menangani kondisi khusus dalam aplikasi. Dengan membuat kelas pengecualian sendiri, kita dapat memberikan informasi yang lebih spesifik tentang kesalahan yang terjadi 🧩

Contoh: 
public class RiniException extends Exception {
    public RiniException(String message) {
        super(s);
    }
}

## 📝 Kesimpulan
Dalam laporan ini, membahas konsep dasar pemrograman berorientasi objek, khususnya terkait dengan operasi CRUD, penanganan kesalahan menggunakan Try Catch, serta penggunaan Throws dan Custom Exception. Memahami konsep-konsep ini sangat penting untuk membangun aplikasi yang robust dan dapat menangani berbagai kondisi kesalahan dengan baik. Dengan penerapan teknik-teknik ini, pengembangan perangkat lunak menjadi lebih terstruktur dan efisien. 🌟

Terima kasih telah membaca laporan ini! Semoga bermanfaat! 🎉
