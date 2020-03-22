package jvm.Exception.A1.A3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 18:21
 * \* Description:
 * \
 */
public class LoggingException extends Exception{

    private static Logger logger =

            Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();

        printStackTrace(new PrintWriter(trace));

        logger.severe(trace.toString());
    }
}
