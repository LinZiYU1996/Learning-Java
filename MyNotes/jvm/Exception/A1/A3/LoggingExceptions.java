package jvm.Exception.A1.A3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 18:22
 * \* Description:
 * \
 */
public class LoggingExceptions {


    public static void main(String[] args) {

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
           System.err.println("Caught" + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught" + e);
        }


    }

    /*
    三月 21, 2020 6:24:23 下午 jvm.Exception.A1.A3.LoggingException <init>
严重: jvm.Exception.A1.A3.LoggingException
	at jvm.Exception.A1.A3.LoggingExceptions.main(LoggingExceptions.java:17)

Caughtjvm.Exception.A1.A3.LoggingException
三月 21, 2020 6:24:23 下午 jvm.Exception.A1.A3.LoggingException <init>
严重: jvm.Exception.A1.A3.LoggingException
	at jvm.Exception.A1.A3.LoggingExceptions.main(LoggingExceptions.java:23)

Caughtjvm.Exception.A1.A3.LoggingException
     */
}
