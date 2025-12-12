package Last_Code_of_CentroWeg_2025_Library;
@SuppressWarnings("all")

public class Book implements Publication {
    private String title, author, reader;
    private int npages, actualpage;
    private boolean open;


    //constructor method
    public Book(String title, String author, int npages, String reader) {
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


    //specific methods
    public String showdetails() {
        return "\nBook:" + "\n" + "Title = " + "'" + title + '\'' + "\n" + "Author = "
                + "'" + author + '\'' + "\n"  + "Reader = " + "'" + reader + '\'' + "\n" + "Number of Pages = " + "'" + npages + '\'' + "\n" + "Actual Page = "
                + "'" + actualpage + '\'' + "\n" + "Open = " + "'" + open;};

    @Override
    public void open() {
        this.setOpen(true);
    }

    @Override
    public void close() {
        this.setOpen(false);
    }

    @Override
    public void leafthrough(int p) {
        this.setOpen(false);
        this.actualpage = p;
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