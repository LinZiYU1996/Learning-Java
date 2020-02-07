package design_pattern.Iterator_pattren.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 20:35
 * \* Description:
 * \
 */
public class Main {


    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBooks(new Book("book1"));
        bookShelf.appendBooks(new Book("book2"));
        bookShelf.appendBooks(new Book("book3"));
        bookShelf.appendBooks(new Book("book4"));

        Iterator iterator = bookShelf.iterator();

        while (iterator.hasnext()){
            Book b = (Book) iterator.next();

            System.out.println(b.getName());
        }

    }
}
