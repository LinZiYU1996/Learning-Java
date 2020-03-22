package jvm.Exception.A1.A3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 19:41
 * \* Description:
 * \
 */
public class LoggingExceptions2 {

    private static Logger logger =

            Logger.getLogger("LoggingExceptions2");

    static void logExecption(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {

        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logExecption(e);
        }

    }

    /*
    三月 21, 2020 7:43:14 下午 jvm.Exception.A1.A3.LoggingExceptions2 logExecption
严重: java.lang.NullPointerException
	at jvm.Exception.A1.A3.LoggingExceptions2.main(LoggingExceptions2.java:30)
     */
}
