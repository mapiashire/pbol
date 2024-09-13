package modul1;

/**
 * @author Anugrah Frumensius Gansalangi//235314091
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Enter a sentence and press Enter : " );
        String sentence = scanner.nextLine();
        StringTokenizer tokens = new StringTokenizer( sentence,"[aeiou]");// memecah kalimat berdasarkan huruf vokal
        System.out.printf( "Number of elements: %d\nThe tokens are:\n",
                tokens.countTokens() );// menampilkan jumlah token
        while ( tokens.hasMoreTokens() )// perulangan untuk menampilkan token
            System.out.println( tokens.nextToken() );
    }
}
