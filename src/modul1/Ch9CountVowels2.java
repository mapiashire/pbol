package modul1;
/**
 * @author Anugrah Frumensius Gansalangi//235314091
 */
import java.util.Scanner;

public class Ch9CountVowels2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, nameUpper;
        int numberOfCharacters, vowelCount = 0;
        char letter;
        System.out.print("What is your name?");
        name = scanner.nextLine();
        numberOfCharacters = name.length();// memasukkan panjang karakter dari variabel name ke dalam variabel numberOfCharacters
        nameUpper = name.toUpperCase();// mengubah isi variabel name menjadi huruf kapital dan memasukkannya ke dalam variabel nameUppeR
        for (int i = 0; i < numberOfCharacters; i++) {// melakukan perulangan sebanyak isi variabel numberOfCharacters
            letter = nameUpper.charAt(i);
            if (letter == 'A' ||
                    letter == 'E' ||
                    letter == 'I' ||
                    letter == 'O' ||
                    letter == 'U') {// blok kode if yang akan dikerjakan jika karakter dari variabel letter adalah huruf vokal
                vowelCount++;// menambahkan isi variabel vowelCount sebanyak 1
            }
        }
        System.out.println(name + ", your name has " +
                vowelCount + " vowels");// mencetak isi variabel name dan vowelCount
    }
}
