import java.time.LocalDate;

public class Loan
{
    Book book;
    Client client;
    LocalDate loanDate;
    LocalDate expectedReturnDate;
    LocalDate realReturnDate;
    double delayFee;

    public Loan(Book book, Client client, LocalDate loanDate, LocalDate expectedReturnDate)
    {
        this.book = book;
        this.client = client;
        this.loanDate = loanDate;
        this.expectedReturnDate = expectedReturnDate;
        this.realReturnDate = realReturnDate;
        this.delayFee = delayFee;
    }

    //getters
    public Book getBook()
    {
        return book;
    }
    public Client getClient()
    {
        return client;
    }
    public LocalDate getLoanDate()
    {
        return loanDate;
    }
    public LocalDate getExpectedReturnDate()
    {
        return expectedReturnDate;
    }
    public LocalDate getRealReturnDate()
    {
        return realReturnDate;
    }
    public double getDelayFee()
    {
        return delayFee;
    }

    //setters
    public void setBook(Book book)
    {
        this.book = book;
    }
    public void setClient(Client client)
    {
        this.client = client;
    }
    public void setLoanDate(LocalDate loanDate){ this.loanDate = loanDate;}
    public void setExpectedReturnDate(LocalDate expectedReturnDate)
    {
        this.expectedReturnDate = expectedReturnDate;
    }
    public void setRealReturnDate(LocalDate realReturnDate) { this.realReturnDate = realReturnDate; }
    public void setDelayFee(double delayFee) { this.delayFee = delayFee; }

    public String toString()
    {
        return  "\n-------Dados do aluguel--------" +
                "\nLivro Alugado: " + this.getBook() +
                "\nCliente: " + this.getClient() +
                "\nData de Aluguel: " + this.getLoanDate() +
                "\nVencimento do Aluguel: " + this.getExpectedReturnDate() +
                "\n---------------------------------";
    }
}
