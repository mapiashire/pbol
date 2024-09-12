package modul1;

import java.util.Scanner;
import java.util.regex.Matcher;// mengimpor Matcher dari package java.util.regex yang berfungsi untuk mencocokkan pola
import java.util.regex.Pattern;// mengimpor Pattern dari package java.util.regex yang berfungsi untuk membuat pola

public class Ch9MatchJavaIdentifier2 {
    private static final String STOP    = "STOP";
    private static final String VALID   = "Valid Java identifier";
    private static final String INVALID = "Not a valid Java identifier";
    private static final String VALID_IDENTIFIER_PATTERN = "[a-zA-Z][a-zA-Z0-9_$]*";
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, reply;
        Matcher  matcher;// deklarasi variabel matcher untuk mencocokkan pola
        Pattern  pattern = Pattern.compile(VALID_IDENTIFIER_PATTERN);// membuat pola yang akan dicocokkan dengan mengambil dari variabel VALID_IDENTIFIER_PATTERN
        while (true) {// perulangan while yang akan terus berjalan sampai user mengimput "STOP"
            System.out.print("Identifier: ");
            str = scanner.next();
            if (str.equals(STOP)) // jika user menginput "STOP" maka program akan berhenti
                break;
            matcher = pattern.matcher(str);// mencocokkan pola dengan inputan user
            if (matcher.matches()) {
                reply = VALID;
            } else {
                reply = INVALID;
            }
            System.out.println(str + ": " + reply + "\n");// menampilkan hasil apakah inputan user valid atau tidak
        }
    }
}
