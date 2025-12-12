package Last_Code_of_CentroWeg_2025_Library;
@SuppressWarnings("all")

public class Library {
    public static void main(String[] args) {
        Reader r[] = new Reader [2];
        Book b[] = new Book [3];

        r[0] = new Reader (38, "Marcia", "Female");
        r[1] = new Reader (199, "Juanito", "Male");

        b[0] = new Book ("Harry Potter and The Philosopher's Stone", "J.K Rowling", 230, r[1].getName());
        b[1] = new Book ("The Odissey", "Romero", 450, r[0].getName());
        b[2] = new Book ("Republic", "Plato", 500, r[1].getName());

        System.out.println(b[0].showdetails());
        System.out.println(b[1].showdetails());
        System.out.println(b[2].showdetails());
    }
}