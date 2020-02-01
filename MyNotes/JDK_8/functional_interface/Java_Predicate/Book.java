package JDK_8.functional_interface.Java_Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 19:55
 * \* Description:
 * \
 */
public class Book {
    private String name;
    private String writer;
    public Book(String name, String writer) {
        this.name = name;
        this.writer = writer;
    }
    public String getName() {
        return name;
    }
    public String getWriter() {
        return writer;
    }
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        final Book b = (Book) obj;
        if (this == b) {
            return true;
        } else {
            return (this.name.equals(b.name) && (this.writer == b.writer));
        }
    }
}
