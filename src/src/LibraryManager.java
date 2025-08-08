import java.util.ArrayList;
import java.util.List;

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


}
