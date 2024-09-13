package modul1;

/**
 * @author Anugrah Frumensius Gansalangi//235314091
 */

public class StringBufferAppend {
    public static void main(String[] args) {
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        StringBuffer lastBuffer = new StringBuffer( "last StringBuffer" );// membuat objek StringBuffer dengan konstruktor
        StringBuffer buffer = new StringBuffer();
        buffer.append( objectRef );// menambahkan objectRef ke buffer
        buffer.append( "\n" );// menambahkan newline ke buffer agar tiap bagian berada pada barisnya sendiri
        buffer.append( string );//
        buffer.append( "\n" );
        buffer.append( charArray );
        buffer.append( "\n" );
        buffer.append( charArray, 0, 3 );// menambahkan charArray dari index 0 hingga 3 ke buffer
        buffer.append( "\n" );
        buffer.append( booleanValue );
        buffer.append( "\n" );
        buffer.append( characterValue );
        buffer.append( "\n" );
        buffer.append( integerValue );
        buffer.append( "\n" );
        buffer.append( longValue );
        buffer.append( "\n" );
        buffer.append( floatValue );
        buffer.append( "\n" );
        buffer.append( doubleValue );
        buffer.append( "\n" );
        buffer.append( lastBuffer );
        System.out.printf( "buffer contains %s\n", buffer.toString() );// menampilkan isi dari buffer setelah semuanya di append
    }
}
