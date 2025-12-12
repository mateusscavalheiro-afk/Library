package Last_Code_of_CentroWeg_2025_Library;
@SuppressWarnings("all")

public class Book implements Publication {
    private String title, author;
    private int npages, actualpage;
    private boolean open;
    private Reader reader;


    //constructor method
    public Book(String title, String author, int npages, Reader reader) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setNpages(npages);
        this.setReader(reader);
        this.setActualpage(0);
        this.setOpen(false);
    }


    //special methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String autor) {
        this.author = autor;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
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


    //specific methods
    public String showdetails() {
        return "\nBook:" + "\n" + "Title = " + "'" + title + '\'' + "\n" + "Author = "
                + author + "\n"  + "Reader = " + reader.getName() + " with " + reader.getAge() + " years old" + "\n" + "Number of Pages = " + npages + "\n" + "Actual Page = "
                + actualpage  + "\n" + "Open = " + (this.open ? "Yes" : "No") + "\n";};

    @Override
    public void open() {
        if (this.open == true) {
            System.out.println("Book already open");
        } else {
            System.out.println("Book opened");
            this.open = true;
        }
    }

    @Override
    public void close() {
        if (this.open == true) {
            System.out.println("Book closed");
            this.setOpen(false);
            this.setActualpage(0);
        } else {
            System.out.println("Book already closed");
        }
    }

    @Override
    public void leafthrough(int p) {
        if (this.open == true) {
            System.out.println("Page " + actualpage + " opened");
        } else {
            System.out.println("Book is closed, can't leafthrough");
        }
    }

    @Override
    public void nexpage() {
        this.actualpage++;
    }

    @Override
    public void previouspage() {
        this.actualpage--;
    }
}