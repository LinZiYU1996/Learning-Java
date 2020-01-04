package chapter_13.c_13_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 23:53 2020/1/3
 */
public class WhitherStringBuilder {

    public String implicit(String[] fields) {
        String result = "";
        for(int i = 0; i < fields.length; i++)
            result += fields[i];
        return result;
    }
    public String explicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < fields.length; i++)
            result.append(fields[i]);
        return result.toString();
    }


}
