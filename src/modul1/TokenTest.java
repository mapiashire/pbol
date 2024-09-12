package modul1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main( String args[] )
    {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Enter a sentence and press Enter : " );
        String sentence = scanner.nextLine();
        StringTokenizer tokens = new StringTokenizer( sentence,"[aeiou]");
        System.out.printf( "Number of elements: %d\nThe tokens are:\n",
                tokens.countTokens() );
        while ( tokens.hasMoreTokens() )
            System.out.println( tokens.nextToken() );
    }
}
