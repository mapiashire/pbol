package modul1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch9PMCountJava2 {
    public static void main (String[] args) {
        String  sentence, pattern;
        sentence = "Sistem manajemen belajar online di Universitas Sanata Dharma" +
                "memiliki keamnanan dan kehandalan yang sangat tinggi. " +
                "Administrator LMS ini dapat diakses dengan username: admin " +
                "dan password: rahasia. Diharapkan semua staff agar merahasiakan " +
                "username dan password ini agar sistem tetap aman sentosa";// kalimat yang akan dicocokkan
        Pattern p1 = Pattern.compile(".username:\\s(\\w+)");// pola yang akan dicocokkan dengan kalimat berdasarkan kata "username"
        Pattern p2 = Pattern.compile(".password:\\s(\\w+)");// pola yang akan dicocokkan dengan kalimat berdasarkan kata "password"
        Matcher matcher1 = p1.matcher(sentence);// membandingkan pola p1 dengan kalimat yang akan dicocokkan
        Matcher matcher2 = p2.matcher(sentence);// membandingkan pola p2  dengan kalimat yang akan dicocokkan
        while (matcher1.find()) {// perulangan while yang akan terus berjalan sampai tidak ada kata "username" lagi
            System.out.println(matcher1.group(0));//
            matcher2.find();// mencari kata "password" yang sesuai
            System.out.println(matcher2.group(0));
        }
    }
}
