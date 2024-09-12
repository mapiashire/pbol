package modul1;

import java.util.Scanner;

public class RegexSoal4 {
    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);

        // a. Bagian program yang memeriksa input dari user apakah berupa bilangan bulat dengan panjang 5-10 karakter
        System.out.print("a. Masukkan input (bilangan bulat 5-10 karakter): ");
        String nomor4Bag_a = aria.nextLine(); // Membaca input pengguna
        String regexA = "^\\d{5,10}$"; // Regex untuk bilangan bulat 5-10 karakter

        if (nomor4Bag_a.matches(regexA)) {
            System.out.println("a. Input \"" + nomor4Bag_a + "\" adalah bilangan bulat dengan panjang antara 5 sampai 10 karakter.");
        } else {
            System.out.println("a. Input \"" + nomor4Bag_a + "\" tidak sesuai dengan petunjuk input");
        }

        /*
        b. Bagian program yang memeriksa input user apakah berakhiran ‘*’ atau ‘#’, diawali dengan angka,
          karakter berikutnya berupa minimal satu huruf besar dan berikutnya huruf kecil atau huruf besar, panjang minimal 8 karakter.
         */
        System.out.print("b. Masukkan input (Diawali dengan angka, minimal terdapat satu huruf kapital, panjang minimal 8 karakter dan berakhit dengan '*' atau '#'): ");
        String nomor4Bag_b = aria.nextLine(); // Membaca input pengguna
        String regexB = "^\\d[A-Z][a-zA-Z]{6,}[*#]$"; // Regex untuk mengecek pola apakah sesuai

        if (nomor4Bag_b.matches(regexB)) {
            System.out.println("b. Input \"" + nomor4Bag_b + "\" sesuai dengan format yang diminta.");
        } else {
            System.out.println("b. Input \"" + nomor4Bag_b + "\" tidak sesuai dengan format yang diminta.");
        }

        //c. Bagian program yang memeriksa input dari user apakah hanya mengandung huruf kecil atau kapital tanpa bilangan
        System.out.print("c. Masukkan input (hanya huruf kecil atau kapital tanpa bilangan): ");
        String nomor4Bag_c = aria.nextLine(); // Membaca input pengguna
        String regexC = "^[A-Za-z]+$"; // Regex untuk mengecek apakah hanya huruf tanpa bilangan

        if (nomor4Bag_c.matches(regexC)) {
            System.out.println("c. Input \"" + nomor4Bag_c + "\" hanya berisi huruf tanpa bilangan.");
        } else {
            System.out.println("c. Input \"" + nomor4Bag_c + "\" mengandung karakter yang tidak diizinkan (bilangan, simbol, dll).");
        }

        // d. Bagian program yang menghapus semua tag HTML dari dokumen HTML yang sudah diberikan
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

        /*
        String regexD = "<[^>]*>" adalah bagian perintah yang digunakan untuk menghapus tag HTML pada String yang dilampirkan.
        String ini bekerja dengan cara mencari tag HTML yang diawali dengan karakter '<' dan diakhiri dengan karakter '>'.
        dan juga menghapus karakter '>' didalam bracket tersebut.
         */
        String regexD = "<[^>]*>";
        // Menggunakan replaceAll untuk menghapus tag HTML
        String plainText = htmlContent.replaceAll(regexD, "");

        // Menampilkan teks bersih setelah operasi Replace All dilakukan
        System.out.println("d. Konten setelah menghapus tag HTML:\n" + plainText.trim());

    }
}
