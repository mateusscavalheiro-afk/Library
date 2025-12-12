package Last_Code_of_CentroWeg_2025_Library;
@SuppressWarnings("all")

public abstract class Book {
    private String title, autor, reader;
    private int npages, actualpage;
    private boolean open;


    //specific methods
    public String showdetails() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", reader='" + reader + '\'' +
                ", npages=" + npages +
                ", actualpage=" + actualpage +
                ", open=" + open +
                '}';
    }


    //constructor method
    public Book(String title, String autor, int npages, String reader) {
        this.title = title;
        this.autor = autor;
        this.npages = npages;
        this.reader = reader;
    }


    //special methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public int getNpages() {
        return npages;
    }

    public void setNpages(int npages) {
        this.npages = npages;
    }

    public int getActualpage() {
        return actualpage;
    }

    public void setActualpage(int actualpage) {
        this.actualpage = actualpage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
