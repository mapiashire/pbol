package modul1;

/**
 * @author Anugrah Frumensius Gansalangi//235314091
 */

import java.util.StringTokenizer;

public class StringConstructors {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = "hello";
        String s1 = "";
        String s2 = s;
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        if (s.equals("hello"))// membandingkan string s dengan string "hello"
            System.out.println("s is equals as \"hello\"");// akan menampilkan pesan ini jika string s sama dengan "hello"
        else
            System.out.println("s is not equals as \"hello\"");// akan menampilkan pesan ini jika string s tidak sama dengan "hello"
        if (s.equalsIgnoreCase("HELLO"))// membandingkan string s dengan string "HELLO" tanpa memperhatikan huruf kapital atau kecil
            System.out.println("s is equals as \"hello\"");// akan menampilkan pesan ini jika string s sama dengan "hello"
        else
            System.out.println("s is not equals as \"hello\"");// akan menampilkan pesan ini jika string s tidak sama dengan "hello"
        if (s3.contains("day"))// memeriksa apakah string s3 mengandung kata "day"
            System.out.println("s3 contains \"day\"");// akan menampilkan pesan ini jika string s3 mengandung kata "day"
        else
            System.out.println("s3 do not contains \"day\"");// akan menampilkan pesan ini jika string s3 tidak mengandung kata "day"
        String s5 = s.concat(" " + s3);// menggabungkan string s dan s3
        System.out.println(s5);// mencetak string s5 hasil penggabungan string s dan s3
        String s6 = s5.replaceAll("hello", "happy");// mengganti kata "hello" dengan "happy"
        System.out.println(s6);// mencetak string s6 hasil penggantian kata "hello" dengan "happy"
        String[] s7 = new String[3];// membuat array string dengan panjang 3
        s7 = s6.split(" ");// memisahkan string s6 dengan delimiter spasi
        for (int i = 0; i < s7.length; i++)// perulangan untuk mencetak string s7
            System.out.println(s7[i]);//
        StringTokenizer tokens = new StringTokenizer(s6);// membuat objek StringTokenizer dengan parameter string s6
        System.out.println("Number of Token =" + tokens.countTokens());
        while (tokens.hasMoreTokens())// perulangan untuk mencetak token
            System.out.println(tokens.nextToken());
    }
}
