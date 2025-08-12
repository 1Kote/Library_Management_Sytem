import java.time.LocalDate;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book("Wind and Fire", "J. R. Martin", 530,
                "Fantasy", "3421234-1", LocalDate.of(2001, 10, 16), 10, 14);
        Client client1 = new Client("035.212.203-03", "Daniel Nascimento Araujo", "lioirq1@gmail.com", "(86) 9 8109-1806");
        Loan loan1 = new Loan(book1, client1, LocalDate.of(2001, 3, 10), LocalDate.of(2001, 4, 30));


    }
}