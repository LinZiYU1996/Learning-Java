package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.flatMap_Example;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:41
 * \* Description:
 * \
 */
public class FlatMapWithArrayOfObject {

//Stream flatMap with Array of Objects
//Here we will provide the example of flatMap with array of objects. We will create two dimensional array of Writer. This class will contain list of books. We will find the book with maximum price.
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
        Writer w1 = new Writer("Mohan", books);
        books = Arrays.asList(new Book(30, "CCC"), new Book(15, "DDD"));
        Writer w2 = new Writer("Sohan", books);
        books = Arrays.asList(new Book(45, "EEE"), new Book(25, "FFF"));
        Writer w3 = new Writer("Vikas", books);
        books = Arrays.asList(new Book(5, "GGG"), new Book(15, "HHH"));
        Writer w4 = new Writer("Ramesh", books);
        Writer[][] writerArray = {{w1,w2},{w3,w4}};


        Book book = Arrays.stream(writerArray)
                .flatMap(row -> Arrays.stream(row))
                .flatMap(writer -> writer.getBooks().stream())
                .max(new BookComparator())
                .get();

        System.out.println("Name:"+book.getName()+", Price:"+ book.getPrice() );




    }
}
