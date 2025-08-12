import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoUnit;

public class LibraryManager
{
    //ArrayList armazenando os livros, clientes e emprestimos
    private ArrayList<Book> books;
    private ArrayList<Client> clients;
    private ArrayList<Loan> loans;

    //Construtor
    public LibraryManager()
    {
        this.books = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        this.books.add(book);
    }

    public void addClient(Client client)
    {
        this.clients.add(client);
    }

    public void addLoan(Loan loan)
    {
        this.loans.add(loan);
    }

    public Book searchIsbn(String isbn)
    {
        for(Book book : this.books)
        {
            if(book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Client searchCpf(String cpf)
    {
        for(Client client : this.clients)
        {
            if(client.getCpf().equals(cpf))
            {
                return client;
            }
        }
        return null;
    }

    public ArrayList<Book> listBooks()
    {
        return this.books;
    }

    public ArrayList<Client> listClients()
    {
        return this.clients;
    }

    public boolean lendBook(String isbn, String cpf, int returnDate)
    {
            this.searchIsbn(isbn);
            this.searchCpf(cpf);
            Book bookToLend = this.searchIsbn(isbn);
            Client clientToLend = this.searchCpf(cpf);

            if(bookToLend != null && clientToLend != null && bookToLend.getCopiesAvailableInStock() > 0)
            {
                LocalDate loanDate = LocalDate.now();
                LocalDate loanExpectedDate = loanDate.plusDays(returnDate);
                Loan newLoan = new Loan(bookToLend, clientToLend, loanDate, loanExpectedDate);
                bookToLend.setCopiesAvailableInStock(bookToLend.getCopiesAvailableInStock() - 1);
                this.addLoan(newLoan);
                return true;
            }
            return false;
    }

    public boolean returnBook(String isbn, String cpf)
    {
        for(Loan loan : this.loans)
        {
            if(loan.getBook().getIsbn().equals(isbn) && loan.getClient().getCpf().equals(cpf) && loan.getRealReturnDate() == null)
            {
                Book returnedBook = loan.getBook();
                returnedBook.setCopiesAvailableInStock(returnedBook.getCopiesAvailableInStock() + 1);
                loan.setRealReturnDate(LocalDate.now());

                if(loan.getRealReturnDate().isAfter(loan.getExpectedReturnDate()))
                {
                    long daysOverdue = ChronoUnit.DAYS.between(loan.getExpectedReturnDate(), loan.getRealReturnDate());
                    double feePerDay = 1.50;
                    loan.setDelayFee(daysOverdue * feePerDay);
                }
                return true;
            }
        }
        return false;
    }

    public List<Loan> ListActiveLoans()
    {
        List<Loan> activeLoans = new ArrayList<>();
        for(Loan loan : this.loans)
        {
            if(loan.getRealReturnDate() == null)
            {
                activeLoans.add(loan);
            }
        }
        return activeLoans;
    }


}
