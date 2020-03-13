package Effective.P16;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/12
 * \* Time: 20:53
 * \* Description:
 * \
 */
public final class Time {

    /*

    让共有类直接暴露域虽然不是好的方法

    但如果域是不可变的 那危害就小一点




     */
    private static final int HOURS_PER_DAY = 24;

    private static final int MINUTES_PER_HOUR = 60;

    public final int hour;

    public final int minute;

    public Time(int hour, int minute) {

        if (hour < 0 || hour >= HOURS_PER_DAY) {
            throw new IllegalArgumentException("hour" + hour);
        }

        if (minute < 0 || minute >= MINUTES_PER_HOUR) {
            throw new IllegalArgumentException("min" + minute);
        }

        this.hour = hour;

        this.minute = minute;

    }
}
