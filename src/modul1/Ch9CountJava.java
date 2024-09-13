package modul1;

import java.util.Scanner;

/**
 * @author Anugrah Frumensius Gansalangi//235314091
 */

public class Ch9CountJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int javaCount = 0;
        String word;
        while (true) {
            System.out.print("Next word: ");
            word = scanner.next();
            if (word.equals("STOP")) {// blok kode if yang akan dikerjakan jika user mengimput "STOP"
                break;
            } else if (word.equalsIgnoreCase("Java")) {// blok kode if yang akan dikerjakan jika user mengimput "java" tanpa memperhatikan huruf kapital atau kecil
                javaCount++;// menambahkan isi variabel javaCount sebanyak 1
            }
        }
        System.out.println("'Java' count: " + javaCount);// Mencetak isi variabel javaCount
    }
}
