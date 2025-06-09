//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book("Wind and Fire", "J. R. Martin", 530, "Fantasy", "3421234-1", LocalDate.of(2001, 10, 16), 10, 14);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
    }
}