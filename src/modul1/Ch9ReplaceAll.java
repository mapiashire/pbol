package modul1;

import java.util.Scanner;

public class Ch9ReplaceAll {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String kalimat = scanner.nextLine();
        String diganti = kalimat.replaceAll("[aeiou]", "@");

        System.out.println("orginal string: " + kalimat);
        System.out.println("replaced string: " + diganti);

        String replaced = diganti.replaceAll("[0-9]", "*");
        System.out.println("replaced number: " + replaced);

        String changed = diganti.replaceAll("\\s+", "");
        System.out.println("replaced white space: " + changed);
    }
}
