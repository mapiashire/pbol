package modul1;

import java.util.Scanner;

public class Ch9ReplaceAll {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String kalimat = scanner.nextLine();
        String diganti = kalimat.replaceAll("[aeiou]", "@");// mengganti huruf vokal dengan karakter "@"

        System.out.println("orginal string: " + kalimat);// menampilkan kalimat asli
        System.out.println("replaced string: " + diganti);// menampilkan kalimat yang sudah diganti

        String replaced = diganti.replaceAll("[0-9]", "*");// mengganti bilangan dengan karakter "*"
        System.out.println("replaced number: " + replaced);// menampilkan kalimat yang sudah diganti

        String changed = diganti.replaceAll("\\s+", "");// menghilangkan spasi
        System.out.println("replaced white space: " + changed);// menampilkan kalimat yang sudah diganti
    }
}
