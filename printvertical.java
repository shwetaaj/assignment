import java.util.Scanner;

public class printvertical {
    public static void main(String[] args) {
        int i = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        reader.close();
        for (; i < n; i++) {
            System.out.println("*");
        }
    }
}

