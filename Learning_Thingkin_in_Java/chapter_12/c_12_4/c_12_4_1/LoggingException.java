package chapter_12.c_12_4.c_12_4_1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:51 2020/1/3
 */
class LoggingException extends Exception{

    private static Logger logger =
            Logger.getLogger("LoggingException");
    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
