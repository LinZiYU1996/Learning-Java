package chapter_15.lesson.l6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 13:09
 * \* Description:
 * \
 */
public class SerialNumberImp implements SerialNumber{

    private static long counter = 1;

    private final long serialnumber = counter++;

    @Override
    public long getSerialNumber() {
        return serialnumber;
    }
}
