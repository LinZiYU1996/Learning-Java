package chapter_19.c_19_8;

import java.util.EnumSet;

import static chapter_19.c_19_8.AlarmPoints.*;
import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 15:21
 * \* Description:
 * \
 */
public class EnumSets {

//    用EnumSets来跟踪报警器的状态


    public static void main(String[] args) {

        EnumSet<AlarmPoints> points =
                EnumSet.noneOf(AlarmPoints.class); // Empty set


        points.add(BATHROOM);

        print(points);

        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));

        print(points);

        points = EnumSet.allOf(AlarmPoints.class);

        points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));

        print(points);

        points.removeAll(EnumSet.range(OFFICE1, OFFICE4));

        print(points);

        points = EnumSet.complementOf(points);

        print(points);

    }
}
