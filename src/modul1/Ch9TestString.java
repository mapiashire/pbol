package modul1;

public class Ch9TestString {
    public static void main(String[] args) {
        String message = "Welcome to Java!";
        String pesan = new String("Welcome to this class!");
        String s = new String();
        s="Welcome";

        System.out.println(message);
        System.out.println(pesan);
        System.out.println(s);
        System.out.println("Huruf ke-3 dari string : "+s.charAt(3));
        System.out.println("Huruf ke-1 hingga 4 dari string adalah : "+message.substring(4, 7));

    }
}
