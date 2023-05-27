# Debugging dengan Logging dan Debug Breakpoint
Ketika mengembangkan aplikasi Android, tentu salah satu hal yang paling menantang adalah saat menemukan bug ketika aplikasi dijalankan.
Memecahkan sebuah bug di platform android bukanlah hal yang mudah. Ada beragam spesifikasi perangkat android yang beredar di pasar.
Aplikasi kita bisa jadi berjalan lancar di satu peranti. Namun bermasalah di peranti yang berbeda. Memusingkan, bukan? Tetapi inilah tantangannya!
Untuk itulah kita mengetahui beberapa cara untuk melakukan Debugging.
Debugging adalah proses untuk mengidentifikasi bug atau masalah yang muncul dan mencari solusinya.
## 3 tipe jenis bug umum yang kerap terjadi pada proses pengembangan aplikasi Android:
- **Java Null Pointer Exception**, umumnya terjadi ketika kode kita mengharapkan obyek tertentu untuk diproses, namun yang ia peroleh adalah nilai null.
- **Java Out of Memory Exception**, umumnya terjadi karena memori yang digunakan oleh aplikasi melebihi jatah yang disediakan oleh sistem android. Bug ini bisa terjadi misalnya ketika kita memuat gambar dengan ukuran besar tanpa mengecilkannya terlebih dahulu.
- **Java Index Out Of Bound**, terjadi ketika kita mencoba mengakses data dengan indeks yang berada di luar jangkauan ukuran dari sebuah collection seperti arraylist atau linkedlist.
## Bug yang menyebabkan Application is not Responding
Android akan menganggap sebuah aplikasi sebagai not responding bila proses yang berjalan di main thread tidak selesai dalam waktu 5 detik.
## Bug yang disebabkan oleh kesalahan logika
Ini adalah bug yang berbahaya. Kesalahan dalam kelompok ini dapat menyebabkan aplikasi berperilaku di luar rancangan kita walaupun aplikasi tidak crash.
## Logging
Logging adalah sebuah cara untuk menampilkan data di dalam Logcat. Berguna untuk mendeteksi nilai suatu object atau memverifikasi suatu fungsi.
Hal ini akan memudahkan Anda dalam mendeteksi suatu data apakah sudah ada atau belum. Ia juga bisa digunakan untuk memberi tahu apakah suatu fungsi sudah terpanggil atau belum.<br />
`Log.d("MainActivity", "Data yang ingin ditampilkan")`<br />
- **Log.e()** untuk log error.
- **Log.w()** untuk log warning.
- **Log.i()** untuk log information.
- **Log.d()** untuk log debug.
- **Log.v()** untuk log verbose.
## Debug breakpoint
Debug breakpoint adalah fitur di dalam Android Studio untuk mendeteksi suatu nilai pada baris kode tertentu ketika aplikasi dijalankan. Inti untuk menemukan sebuah bug adalah dengan membaca error log yang ada pada android monitor dengan seksama.
