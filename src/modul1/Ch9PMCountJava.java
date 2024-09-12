package modul1;

import java.util.*;
import java.util.regex.*;// mengimpor regex dari java.util untuk menggunakan Pattern dan Matcher

public class Ch9PMCountJava {
    public static void main (String[] args) {
        String   document = "Sistem manajemen belajar online di Universitas Sanata Dharma" +
                "memiliki keamnanan dan kehandalan yang sangat tinggi. " +
                "Administrator LMS ini dapat diakses dengan username: admin " +
                "dan password: rahasia. Diharapkan semua staff agar merahasiakan " +
                "username dan password ini agar sistem tetap aman sentosa";// kalimat yang akan dihitung jumlah kata "username"
        int      wCount;
        Matcher  matcher;// deklarasi variabel matcher
        Pattern  pattern = Pattern.compile("username", Pattern.CASE_INSENSITIVE);// pola yang akan dicocokkan
        System.out.print("Sentence: " + document + "\n");// menampilkan kalimat yang akan dihitung jumlah kata "username"
        wCount = 0;
        matcher   = pattern.matcher(document);// membandingkan pola dengan kalimat yang akan dihitung jumlah kata "username"
        while (matcher.find()) {// perulangan while yang akan terus berjalan sampai tidak ada kata "username" lagi
            wCount++;
        }
        System.out.println("The word 'username' occurred " + wCount + " times.");// menampilkan jumlah kata "username" yang ada
    }
}
