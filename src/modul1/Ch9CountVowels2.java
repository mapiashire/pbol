package modul1;

import java.util.Scanner;

public class Ch9CountVowels2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, nameUpper;
        int numberOfCharacters,
                vowelCount = 0;
        char letter;
        System.out.print("What is your name?");
        name = scanner.nextLine();
        numberOfCharacters = name.length();
        nameUpper = name.toUpperCase();
        for (int i = 0; i < numberOfCharacters; i++) {
            letter = nameUpper.charAt(i);
            if (letter == 'A' ||
                    letter == 'E' ||
                    letter == 'I' ||
                    letter == 'O' ||
                    letter == 'U') {
                vowelCount++;
            }
        }
        System.out.println(name + ", your name has " +
                vowelCount + " vowels");
    }
}
