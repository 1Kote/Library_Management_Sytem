import java.time.LocalDate;

public class Book
{
    private String title;
    private String author;
    private int pages;
    private String genre;
    private String isbn;
    private LocalDate publicationDate;
    private int copiesAvailableInStock;
    private int totalCopies;

    //constructor
    public Book(String title, String author, int pages, String genre, String isbn, LocalDate publicationDate, int copiesAvailableInStock, int totalCopies)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.copiesAvailableInStock = copiesAvailableInStock;
        this.totalCopies = totalCopies;
    }


    public String toString()
    {
        return  "ISBN: " + this.getIsbn() +
                "\nTitle: " + this.getTitle() +
                "\nAuthor: " + this.getAuthor() +
                "\nPages: " + this.getPages() +
                "\nGenre: " + this.getGenre() +
                "\nCopies avaliable in Stock: " + this.getCopiesAvailableInStock() +
                "\nPublication Date: " + this.getPublicationDate();
    }

    //getters
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPages()
    {
        return pages;
    }
    public String getGenre()
    {
        return genre;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public LocalDate getPublicationDate()
    {
        return publicationDate;
    }
    public int getCopiesAvailableInStock()
    {
        return copiesAvailableInStock;
    }
    public int getTotalCopies()
    {
        return totalCopies;
    }

    //setters
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    public void setDate(LocalDate publicationDate)
    {
       this.publicationDate = publicationDate;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    public void setCopiesAvailableINStock(int copiesAvailableInStock)
    {
        this.copiesAvailableInStock = copiesAvailableInStock;
    }
    public void setTotalCopies(int totalCopies)
    {
        this.totalCopies = totalCopies;
    }

    public void bookSearch()
    {

    }
}
