import java.util.Date;

public class Book
{
    private String title;
    private String author;
    private int pages;
    private double price;
    private String genre;
    private int isbn;
    private Date date;
    private int copiesSold;
    private int copiesReserved;
    private int copiesAvailableInStock;
    private int totalCopies;

    //constructor
    public Book(String title, String author, int pages, double price, String genre, int isbn, Date date, int copiesSold, int copiesReserved, int copiesAvailableInStock, int totalCopies)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.genre = genre;
        this.isbn = isbn;
        this.date = date;
        this.copiesSold = copiesSold;
        this.copiesReserved = copiesReserved;
        this.copiesAvailableInStock = copiesAvailableInStock;
        this.totalCopies = totalCopies;
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
    public double getPrice()
    {
        return price;
    }
    public String getGenre()
    {
        return genre;
    }
    public int getIsbn()
    {
        return isbn;
    }
    public Date getDate()
    {
        return date;
    }
    public int getCopiesSold()
    {
        return copiesSold;
    }
    public int getCopiesReserved()
    {
        return copiesReserved;
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
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    public void setDate(Date date)
    {
       this.date = date;
    }
    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }

    public void setCopiesSold(int copiesSold)
    {
        this.copiesSold = copiesSold;
    }
    public void setCopiesReserved(int copiesReserved)
    {
        this.copiesReserved = copiesReserved;
    }
    public void setCopiesAvailableINStock(int copiesAvailableInStock)
    {
        this.copiesAvailableInStock = copiesAvailableInStock;
    }
    public void setTotalCopies(int totalCopies)
    {
        this.totalCopies = totalCopies;
    }
}
