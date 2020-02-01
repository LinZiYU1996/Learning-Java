package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.flatMap_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:34
 * \* Description:
 * \
 */
public class Demo1 {


    //We will discuss here Stream.flatMap and Optional.flatMap() method. Stream.flatMap() returns the stream which will contain the elements obtained by replacement of each element of the source stream by a mapping function and and flattens the result. Mapping function will produce stream and each mapped stream is closed after applying the mapping. It is useful to apply statistical function on the stream of objects and can be coded in a single line. Optional.flatMap() applies the Optional-bearing mapping function to it if value is present. Now find the examples for flatMap with different scenarios.
    //According to the Java Doc, Stream.flatMap() method signature is as given below.
    //<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
    // Optional.flatMap() method signature is as given below.
    //public <U> Optional<U> flatMap(Function<? super T,Optional<U>> mapper)



    //Stream flatMap with List



//Here we have a List of writers. Each writer has list of books. Using Stream.flatMap() we will get stream of books from all writers. And then we will find the book with highest price. We will understand it step wise.
//1. Stream of writers.
//{
//   {"Mohan",
//    {
//      {10,"AAA"}, {20,"BBB"}
//    }
//   },
//   {"Sohan",
//    {
//      {30,"XXX"}, {15,"ZZZ"}
//    }
//   }
//}
//2. After flatMap(writer -> writer.getBooks().stream()), find the stream of books.
//{
//   {10,"AAA"},
//   {20,"BBB"},
//   {30,"XXX"},
//   {15,"ZZZ"}
//}
//Here the result has been flattened by flatMap().
//
//3. After max(new BookComparator()), find the book with maximum price.
//{30,"XXX"}



}
