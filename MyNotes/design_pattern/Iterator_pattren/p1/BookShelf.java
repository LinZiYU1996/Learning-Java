package design_pattern.Iterator_pattren.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 20:30
 * \* Description:
 * \
 */
public class BookShelf implements Aggregate{

    private Book[] books;

    private int last = 0;

    public BookShelf(int maxsize) {

        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBooks(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
