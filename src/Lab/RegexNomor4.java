package Lab;

import java.util.Scanner;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

public class RegexNomor4 {
    public static void main(String[] args) {
        Scanner oke = new Scanner(System.in); // Membuat Scanner untuk membaca input pengguna

        // a. Memeriksa apakah input berupa angka dengan panjang antara 5 sampai 10 karakter
        System.out.print("a. Masukkan input (angka 5-10 karakter): ");
        String nomor4a = oke.nextLine(); // Membaca input pengguna
        String regexA = "^\\d{5,10}$"; // Regex untuk angka 5-10 karakter

        if (nomor4a.matches(regexA)) {
            System.out.println("a. Input \"" + nomor4a + "\" adalah angka dengan panjang antara 5 sampai 10 karakter.");
        } else {
            System.out.println("a. Input \"" + nomor4a + "\" tidak sesuai dengan aturan angka 5-10 karakter.");
        }

        // b. Memeriksa input yang berakhir dengan '*' atau '#', diawali dengan angka dan memiliki format tertentu
        System.out.print("b. Masukkan input (input diawali dengan angka, minimal satu huruf besar, panjang minimal 8 karakter, berakhir dengan '*' atau '#'): ");
        String nomor4b = oke.nextLine(); // Membaca input pengguna
        String regexB = "^\\d[A-Z][a-zA-Z]{6,}[*#]$"; // Regex untuk pola yang diberikan

        if (nomor4b.matches(regexB)) {
            System.out.println("b. Input \"" + nomor4b + "\" sesuai dengan format yang diminta.");
        } else {
            System.out.println("b. Input \"" + nomor4b + "\" tidak sesuai dengan format yang diminta.");
        }

        // c. Memeriksa apakah input hanya mengandung huruf kecil atau besar tanpa angka
        System.out.print("c. Masukkan input (hanya huruf besar atau kecil tanpa angka): ");
        String nomor4c = oke.nextLine(); // Membaca input pengguna
        String regexC = "^[A-Za-z]+$"; // Regex untuk memeriksa hanya huruf

        if (nomor4c.matches(regexC)) {
            System.out.println("c. Input \"" + nomor4c + "\" hanya berisi huruf tanpa angka.");
        } else {
            System.out.println("c. Input \"" + nomor4c + "\" mengandung karakter yang tidak diizinkan (misalnya angka).");
        }

        // d. Menghapus semua tag HTML dari dokumen HTML yang sudah diberikan
        String htmlContent = "<html lang=\"id\">\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "<title>Contoh Halaman Web</title>\n" +
                "</head>\n" +
                "<body> <header> <h1>Selamat Datang di Situs Kami!</h1> </header>\n" +
                "<main> <p>Ini adalah paragraf pertama dari halaman web contoh ini. HTML\n" +
                "adalah bahasa yang digunakan untuk membuat struktur halaman web.</p>\n" +
                "<p>Anda bisa belajar lebih lanjut tentang HTML di <a\n" +
                "href=\"https://www.htmlschools.com\"\n" +
                "target=\"_blank\">HTMLSchools</a>.</p> </main>\n" +
                "<footer> <p> 2024 Contoh Halaman Web. Semua hak cipta dilindungi.</p>\n" +
                "</footer>\n" +
                "</body>\n" +
                "</html>";

        // Regex untuk menghapus semua tag HTML
        String regexD = "<[^>]*>";

        // Menggunakan replaceAll untuk menghapus semua tag HTML
        String plainText = htmlContent.replaceAll(regexD, "");

        // Menampilkan teks setelah menghapus tag HTML
        System.out.println("d. Konten setelah menghapus tag HTML:\n" + plainText.trim());

        oke.close(); // Menutup Scanner setelah selesai digunakan
    }
}