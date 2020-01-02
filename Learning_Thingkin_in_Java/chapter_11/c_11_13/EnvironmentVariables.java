package chapter_11.c_11_13;

import java.util.Map;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:50 2020/1/2
 */
public class EnvironmentVariables {

    public static void main(String[] args) {
        for(Map.Entry entry: System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }

}
