package modul1;

import java.util.Scanner;

public class Ch9ExtractWords {
    private static final char BLANK = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index, numberOfCharacters,
                beginIdx, endIdx;
        String word, sentence;
        System.out.print("Input: ");
        sentence = scanner.nextLine();
        numberOfCharacters = sentence.length();
        index = 0;
        while (index < numberOfCharacters) {
            while (index < numberOfCharacters &&
                    sentence.charAt(index) == BLANK) {
                index++;
            }
            beginIdx = index;
            while (index < numberOfCharacters &&
                    sentence.charAt(index) != BLANK) {
                index++;
            }
            endIdx = index;
            if (beginIdx != endIdx) {
                word = sentence.substring(beginIdx, endIdx);
                System.out.println(word);
            }
        }
    }
}
