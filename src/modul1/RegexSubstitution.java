package modul1;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "Every day is sunday";
        String secondString = "Vini pergi ke pasar 3 jam lalu, bersama 4 temannya";
        System.out.printf("Original String 1: %s\n", firstString);// menampilkan string asli variabel firstString
        firstString = firstString.replaceAll("\\bday\\b", "week there");// mengganti kata "day" dengan "week there"
        System.out.printf("Original string 1 become : %s\n", firstString);// menampilkan variabel firstString yang sudah dimodifikasi
        System.out.printf("Original String 2: %s\n", secondString);// menampilkan string asli variabel secondString
        secondString = secondString.replaceAll("[a]", "o");// mengganti huruf a dengan huruf o
        System.out.printf("Original string 2 become : %s\n", secondString);// menampilkan variabel secondString yang sudah dimodifikasi
        System.out.printf("Every word replaced by \"word\": %s\n\n", firstString.replaceAll("\\w+", "word"));// mengganti setiap kata dengan kata "word"
        secondString = secondString.replaceFirst("\\d", "digit");// mengganti digit pertama variabel secondString dengan kata "digit"
        System.out.printf("?? %s\n", secondString);// menampilkan variabel secondString yang sudah dimodifikasi dengan tambahan '??' yang berada di depannya
        String output = "String split at commas: [";// menampilkan string "String split at commas: ["
        String[] results = secondString.split(",\\s*");// memisahkan string secondString dengan delimiter koma
        for (String string : results)// menampilkan hasil split dengan perulangan for
            output += "\"" + string + "\", ";
        System.out.println("Hasil split : " + output);// menampilkan hasil split
        output = output.substring(0, output.length() - 2) + "]";// menghilangkan dua karakter terakhir dari variabel output
        System.out.println(output);// menampilkan output
    } // end main
}
