package modul1;

import java.util.Scanner;

public class Ch9CountJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int javaCount = 0;
        String word;
        while (true) {
            System.out.print("Next word: ");
            word = scanner.next();
            if (word.equals("STOP")) {
                break;
            } else if (word.equalsIgnoreCase("Java")) {
                javaCount++;
            }
        }
        System.out.println("'Java' count: " + javaCount);
    }
}
