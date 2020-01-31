package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Concat_Streams_Lists_Sets_Arrays;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:35
 * \* Description:
 * \
 */
public class ConcatArraysDemo {

//In this example we have two arrays. These arrays will be converted into streams then they will be concatenated using concat() method. The output stream will be converted into array using Stream.toArray(). To get distinct element, we need to use Stream.distinct().
    public static void main(String[] args) {

        Book[] bk1 = new Book[3];
        Book[] bk2 = new Book[3];
        {
            bk1[0] = new Book("Core Java", 200);
            bk1[1] = new Book("Spring MVC", 300);
            bk1[2] = new Book("Learning Freemarker", 150);
            bk2[0] = new Book("Core Java", 200);
            bk2[1] = new Book("Spring MVC", 300);
            bk2[2] = new Book("Learning Hibernate", 400);
        }
        Book[] bks = (Book[]) Stream.concat(Stream.of(bk1), Stream.of(bk2)).toArray(b -> new Book[b]);
        for(Book b : bks) {
            System.out.println(b.getName()+", "+ b.getPrice());
        }
        System.out.println("");
        //Remove duplicates using distinct()
        System.out.println("--Remove duplicates using distinct()--");
        bks = (Book[]) Stream.concat(Stream.of(bk1), Stream.of(bk2)).distinct().toArray(b -> new Book[b]);
        for(Book b : bks) {
            System.out.println(b.getName()+", "+ b.getPrice());
        }

    }
}
