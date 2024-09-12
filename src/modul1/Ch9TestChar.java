package modul1;

public class Ch9TestChar {
    public static void main (String[] args) {

        System.out.println("Kode ASCII dari karakter X : " + (int)'X' );// menampilkan kode ASCII dari karakter X

        System.out.println("Karakter dengan kode ASCII 88 : " + (char)88 );// menampilkan karakter dengan kode ASCII 88
        if (Character.isUpperCase('a'))// memeriksa apakah huruf a adalah huruf kapital
            System.out.println("Huruf Besar");
        else
            System.out.println("Huruf besarnya a adalah : "+Character.toUpperCase('a'));// menampilkan huruf kapital dari huruf a

        char angka='8';
        if (Character.isDigit(angka))// memeriksa apakah angka adalah digit/bilangan
            System.out.println("Angka "+angka);

        char huruf='z';// huruf yang akan diperiksa
        if (Character.isLetter(huruf))// memeriksa apakah variabel huruf berisi character
            System.out.println("Huruf "+huruf);

    }
}
