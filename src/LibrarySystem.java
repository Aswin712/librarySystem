import java.util.HashMap;
import java.util.Scanner;

public class LibrarySystem  {
    public static final HashMap<String, String> studentMap = new HashMap<>();
    public static final HashMap<String, String> adminMap = new HashMap<>();
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        studentMap.put("202210370311203", "student1");
        adminMap.put("admin", "admin");

        while (true) {
            System.out.println("===== Library System");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                loginAsStudent();
            } else if (choice == 2) {
                loginAsAdmin();
            } else if (choice == 3) {
                System.out.println("Terima Kasih");
                break;
            } else {
                System.out.println("Invalid option, please choose again.");
            }
        }

        scanner.close();
    }

    private static void loginAsStudent() {
        System.out.print("Enter your NIM : ");
        String nim = scanner.next();

        if (studentMap.containsKey(nim)) {
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("User Not Found");
        }
        System.out.println("=====");
    }

    private static void loginAsAdmin() {
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();

        System.out.print("Enter your password (admin): ");
        String password = scanner.next();

        if (adminMap.containsKey(username) && adminMap.get(username).equals(password)) {
            System.out.println("Successful Login as Admin");
        } else {
            System.out.println("Admin User Not Found!!");
        }
        System.out.println("=====");
    }
}