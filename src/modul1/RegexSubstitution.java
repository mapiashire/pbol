package modul1;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "Every day is sunday";
        String secondString = "Vini pergi ke pasar 3 jam lalu, bersama 4 temannya";
        System.out.printf("Original String 1: %s\n", firstString);
        firstString = firstString.replaceAll("\\bday\\b", "week there");
        System.out.printf("Original string 1 become : %s\n", firstString);
        System.out.printf("Original String 2: %s\n", secondString);
        secondString = secondString.replaceAll("[a]", "o");
        System.out.printf("Original string 2 become : %s\n", secondString);
        System.out.printf("Every word replaced by \"word\": %s\n\n", firstString.replaceAll("\\w+", "word"));
        secondString = secondString.replaceFirst("\\d", "digit");
        System.out.printf("?? %s\n", secondString);
        String output = "String split at commas: [";
        String[] results = secondString.split(",\\s*");
        for (String string : results)
            output += "\"" + string + "\", ";
        System.out.println("Hasil split : " + output);
        output = output.substring(0, output.length() - 2) + "]";
        System.out.println(output);
    } // end main
}
