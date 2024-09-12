package modul1;

import java.util.Scanner;

public class Ch9ExtractWords {
    private static final char BLANK = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index, numberOfCharacters,
                beginIdx, endIdx;//
        String word, sentence;
        System.out.print("Input: ");
        sentence = scanner.nextLine();// memasukkan inputan user ke dalam variabel sentence
        numberOfCharacters = sentence.length();// memasukkan panjang karakter dari variabel sentence ke dalam variabel numberOfCharacters
        index = 0;
        while (index < numberOfCharacters) {// melakukan perulangan selama index kurang dari numberOfCharacters
            while (index < numberOfCharacters &&
                    sentence.charAt(index) == BLANK) {// melakukan perulangan selama index kurang dari numberOfCharacters dan karakter dari variabel sentence pada index ke-i adalah spasi
                index++;
            }
            beginIdx = index;// memasukkan nilai index ke dalam variabel beginIdx
            while (index < numberOfCharacters &&
                    sentence.charAt(index) != BLANK) {// melakukan perulangan selama index kurang dari numberOfCharacters dan karakter dari variabel sentence pada index ke-i bukan spasi
                index++;
            }
            endIdx = index;// memasukkan nilai index ke dalam variabel endIdx
            if (beginIdx != endIdx) {// blok kode if yang akan dikerjakan jika beginIdx tidak sama dengan endIdx
                word = sentence.substring(beginIdx, endIdx);// memasukkan substring dari variabel sentence dari index beginIdx sampai endIdx ke dalam variabel word
                System.out.println(word);// mencetak isi variabel word
            }
        }
    }
}
