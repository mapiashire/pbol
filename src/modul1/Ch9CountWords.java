package modul1;

import java.util.*;
import javax.swing.JOptionPane;

class Ch9CountWords {
    private static final char BLANK = ' ';
    public static void main (String[] args) {
        int     index, wordCount, numberOfCharacters;
        String sentence = JOptionPane.showInputDialog("Enter a sentence: ");
        numberOfCharacters  = sentence.length( );// memasukkan panjang karakter dari variabel sentence ke dalam variabel numberOfCharacters
        index               = 0;
        wordCount           = 0;
        while ( index < numberOfCharacters ) {// melakukan perulangan selama index kurang dari numberOfCharacters
            while (index < numberOfCharacters &&// melakukan perulangan selama index kurang dari numberOfCharacters dan karakter dari variabel sentence pada index ke-i adalah spasi
                    sentence.charAt(index) == BLANK) {
                index++;// menambahkan isi variabel index sebanyak 1
            }
            while (index < numberOfCharacters && // melakukan perulangan selama index kurang dari numberOfCharacters dan karakter dari variabel sentence pada index ke-i bukan spasi
                    sentence.charAt(index) != BLANK) {
                index++;// menambahkan isi variabel index sebanyak 1
            }
            wordCount++;// menambahkan isi variabel wordCount sebanyak 1 jika sudah menemukan kata
        }
        System.out.println( "\nInput sentence: " + sentence );
        System.out.println( "    Word count: " + wordCount + " words" );
    }
}
