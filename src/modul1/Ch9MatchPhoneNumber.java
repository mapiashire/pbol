package modul1;

/**
 * @author Anugrah Frumensius Gansalangi//235314091
 */

import java.util.Scanner;

public class Ch9MatchPhoneNumber {
    private static final String STOP = "0";
    private static final String VALID = "Valid phone number";
    private static final String INVALID = "Not a valid phone number";
    private static final String VALID_PHONE_PATTERN
            = "[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]";// pola dari nomor handphone yang akan dicocokkan
    //                 = "[0-9]{4}-[0-9]{3}-[0-9]{4}";
//                 = "\\d{4}-\\d{3}-\\d{4}";
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneStr, reply;
        while (true) {// perulangan while yang akan terus berjalan sampai user mengimput "STOP"
            System.out.print("Phone#: ");
            phoneStr = scanner.next();
            if (phoneStr.equals(STOP)) break;// jika user menginput "STOP" maka program akan berhenti
            if (phoneStr.matches(VALID_PHONE_PATTERN)) {// memeriksa apakah inputan user sesuai dengan pola yang diberikan
                reply = VALID;
            } else {
                reply = INVALID;
            }
            System.out.println(phoneStr + ": " + reply + "\n");// menampilkan hasil apakah inputan user valid atau tidak
        }
    }
}
