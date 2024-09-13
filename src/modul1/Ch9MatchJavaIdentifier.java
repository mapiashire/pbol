package modul1;

/**
 * @author Anugrah Frumensius Gansalangi//235314091
 */

import java.util.Scanner;

public class Ch9MatchJavaIdentifier {
    private static final String STOP = "STOP";
    private static final String VALID = "Valid Java identifier";
    private static final String INVALID = "Not a valid Java identifier";
    private static final String VALID_IDENTIFIER_PATTERN = "[a-zA-Z][a-zA-Z0-9_$]*";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, reply;
        while (true) {// perulangan while yang akan terus berjalan sampai user mengimput "STOP"
            System.out.print("Identifier: ");
            str = scanner.next();
            if (str.equals(STOP))// jika user menginput "STOP" maka program akan berhenti
                break;
            if (str.matches("[a-zA-Z][a-zA-Z0-9_$]*")) {// jika inputan user sesuai dengan pattern yang diberikan
                reply = VALID;
            } else {
                reply = INVALID;
            }
            System.out.println(str + ": " + reply + "\n");// menampilkan hasil apakah inputan user valid atau tidak
        }
    }
}
