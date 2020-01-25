package JDK_8.chapter_3.c_3_3;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {


//    任何 BufferedReader -> String 形式的Lambda都可以作为参数来传递，因为它们符合
//BufferedReaderProcessor 接口中定义的 process 方法的签名。现在你只需要一种方法在
//processFile 主体内执行Lambda所代表的代码。请记住，Lambda表达式允许你直接内联，为
//函数式接口的抽象方法提供实现，并且将整个表达式作为函数式接口的一个实例


    String process(BufferedReader b) throws IOException;


}
