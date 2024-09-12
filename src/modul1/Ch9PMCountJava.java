package modul1;

import java.util.*;
import java.util.regex.*;

public class Ch9PMCountJava {
    public static void main (String[] args) {
        String   document = "Sistem manajemen belajar online di Universitas Sanata Dharma" +
                "memiliki keamnanan dan kehandalan yang sangat tinggi. " +
                "Administrator LMS ini dapat diakses dengan username: admin " +
                "dan password: rahasia. Diharapkan semua staff agar merahasiakan " +
                "username dan password ini agar sistem tetap aman sentosa";
        int      wCount;
        Matcher  matcher;
        Pattern  pattern = Pattern.compile("username", Pattern.CASE_INSENSITIVE);
        System.out.print("Sentence: " + document + "\n");
        wCount = 0;
        matcher   = pattern.matcher(document);
        while (matcher.find()) {
            wCount++;
        }
        System.out.println("The word 'username' occurred " + wCount + " times.");
    }
}
