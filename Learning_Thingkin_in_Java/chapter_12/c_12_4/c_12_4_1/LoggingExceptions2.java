package chapter_12.c_12_4.c_12_4_1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:53 2020/1/3
 */
public class LoggingExceptions2 {

    private static Logger logger =
            Logger.getLogger("LoggingExceptions2");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch(NullPointerException e) {
            logException(e);
        }
    }



}
