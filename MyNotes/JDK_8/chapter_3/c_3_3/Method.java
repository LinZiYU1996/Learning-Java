package JDK_8.chapter_3.c_3_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 11:05
 * \* Description:
 * \
 */
public class Method {


//    通过一个例子，看看在实践中如何利用Lambda和行为参数化来让代码更为灵活，更
//为简洁。资源处理（例如处理文件或数据库）时一个常见的模式就是打开一个资源，做一些处理，
//然后关闭资源。这个设置和清理阶段总是很类似，并且会围绕着执行处理的那些重要代码。这就
//是所谓的环绕执行（execute around）模式，如图3-2所示。例如，在以下代码中，高亮显示的就
//是从一个文件中读取一行所需的模板代码（注意你使用了Java 7中的带资源的 try 语句，它已经
//简化了代码，因为你不需要显式地关闭资源了）：


    public static String processFile() throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

    public static String processFile_2(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }


    public static void main(String[] args) throws IOException {

//        现在你就可以通过传递不同的Lambda重用 processFile 方法，并以不同的方式处理文件了。

        //处理一行
          String oneLine =
                processFile_2((BufferedReader br) -> br.readLine());

          //处理两行

        String twoLines =
                processFile_2((BufferedReader br) -> br.readLine() + br.readLine());
    }



}
