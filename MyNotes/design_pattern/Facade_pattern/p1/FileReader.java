package design_pattern.Facade_pattern.p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/18
 * \* Time: 20:56
 * \* Description:
 * \
 */
public class FileReader{

//文件读取类：子系统类

    public String read(String fileNameSrc) {
        System.out.print("读取文件，获取明文：");
        StringBuffer sb = new StringBuffer();
        try{
            FileInputStream inFS = new FileInputStream(fileNameSrc);
            int data;
            while((data = inFS.read())!= -1) {
                sb = sb.append((char)data);
            }
            inFS.close();
            System.out.println(sb.toString());
        }
        catch(FileNotFoundException e) {
            System.out.println("文件不存在！");
        }
        catch(IOException e) {
            System.out.println("文件操作错误！");
        }
        return sb.toString();
    }
}
