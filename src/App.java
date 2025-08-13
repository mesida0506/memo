import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in,"Shift-JIS"); 
        System.out.print("タイトル： ");
        String title = scanner.next();
        System.out.println(title);
        System.out.print("つぶやき： ");
        String tweet = scanner.next();
        System.out.println(tweet);
    }
}
