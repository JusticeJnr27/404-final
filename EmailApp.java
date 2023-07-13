import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your Last Name: ");
        String lastName = scanner.nextLine();

        Email em1 = new Email(firstName, lastName);

        System.out.println(em1.showInfo());
    }
}