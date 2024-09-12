package modul1;

import java.util.Scanner;

public class Ch9CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int numberOfCharacters, vowelCount = 0;
        char letter;
        System.out.print("What is your name? ");
        name = scanner.nextLine();
        numberOfCharacters = name.length();// memasukkan panjang karakter dari variabel name ke dalam variabel numberOfCharacters
        System.out.println(name);// mencetak isi variabel name
        for (int i = 0; i < numberOfCharacters; i++) {// melakukan perulangan sebanyak isi variabel numberOfCharacters
            letter = name.charAt(i);// memasukkan karakter ke-i dari variabel name ke dalam variabel letter
            if (letter == 'a' || letter == 'A' ||
                    letter == 'e' || letter == 'E' ||
                    letter == 'i' || letter == 'I' ||
                    letter == 'o' || letter == 'O' ||
                    letter == 'u' || letter == 'U') {// blok kode if yang akan dikerjakan jika karakter dari variabel letter adalah huruf vokal
                vowelCount++;
            }
        }
        System.out.println(name + ", your name has " +
                vowelCount + " vowels");// mencetak isi variabel name dan vowelCount
    }
}
