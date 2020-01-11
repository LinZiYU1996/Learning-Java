package chapter_17.demo.d6;

import chapter_5.c_5_8.c_5_8_1.A;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 15:54
 * \* Description:
 * \
 */
public class SpringDetector {

    public static <T extends Groundhog>
        void detectSpring(Class<T> type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor<T> ghog = type.getConstructor(int.class);

        Map<Groundhog,Prediction> map =
                new HashMap<>();

        for (int i = 0; i < 10; i++) {

            map.put(ghog.newInstance(i),new Prediction());

        }

        System.out.println("map   " + map);

        Groundhog gh = ghog.newInstance(3);

        System.out.println("prediction  " + gh);

        if (map.containsKey(gh)) {
            System.out.println(map.get(gh));
        } else {
            System.out.println("No found" + gh);
        }

    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        detectSpring(Groundhog.class);


    }
}
