package Last_Code_of_CentroWeg_2025_Library;
import java.util.Scanner;
@SuppressWarnings("all")

public class Library {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Reader r[] = new Reader[2];
        r[0] = new Reader(38, "Marcia", "Female");
        r[1] = new Reader(199, "Juanito", "Male");

        Book b[] = new Book[3];
        b[0] = new Book("Harry Potter", "J.K Rowling", 230, r[1]);
        b[1] = new Book("The Odyssey", "Homer", 450, r[0]);
        b[2] = new Book("Republic", "Plato", 500, r[1]);

        int bookIndex = 0;
        int option = -1;

        System.out.println("--- Welcome to the Library System ---");

        while (option != 0) {
            System.out.println("\nCURRENT BOOK: " + b[bookIndex].getTitle());
            System.out.println("1 - Select Book (0, 1 or 2)");
            System.out.println("2 - Show Details");
            System.out.println("3 - Open Book");
            System.out.println("4 - Close Book");
            System.out.println("5 - Leaf Through (Jump pages)");
            System.out.println("6 - Next Page");
            System.out.println("7 - Previous Page");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            option = teclado.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter book index (0-2): ");
                    int choice = teclado.nextInt();
                    if (choice >= 0 && choice < b.length) {
                        bookIndex = choice;
                        System.out.println("Book changed to: " + b[bookIndex].getTitle());
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 2:
                    System.out.println(b[bookIndex].showdetails());
                    break;
                case 3:
                    b[bookIndex].open();
                    break;
                case 4:
                    b[bookIndex].close();
                    break;
                case 5:
                    System.out.print("How many pages to jump? ");
                    int jump = teclado.nextInt();
                    b[bookIndex].leafthrough(jump);
                    break;
                case 6:
                    b[bookIndex].nexpage();
                    break;
                case 7:
                    b[bookIndex].previouspage();
                    break;
                case 0:
                    System.out.println("Closing system...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        teclado.close();
    }
}