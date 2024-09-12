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
                "username dan password ini agar sistem tetap aman sentosa";
        Pattern p1 = Pattern.compile(".username:\\s(\\w+)");
        Pattern p2 = Pattern.compile(".password:\\s(\\w+)");
        Matcher matcher1 = p1.matcher(sentence);
        Matcher matcher2 = p2.matcher(sentence);
        while (matcher1.find()) {
            System.out.println(matcher1.group(0));
            matcher2.find();
            System.out.println(matcher2.group(0));
        }
    }
}
