package JDK_8.Java_8_Function_Programming.chapter_3.A1.a2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 19:38
 * \* Description:
 * \
 */
public class DataSource {



    public static String c_id(){

        Random random = new Random(123);

        int id = random.nextInt();

        return String.valueOf(id);
    }


    public static String c_regionId(){

        Random random = new Random(223);

        int id = random.nextInt();

        return String.valueOf(id);

    }


    public static LocalDateTime c_LocalDateTime(){
        LocalDateTime today = LocalDateTime.now();
        return today;
    }


    public static double c_noiseValue(){

        Random random = new Random(236);

        double noiseValue = random.nextDouble();

        return noiseValue;
    }


    public static double c_noiseStatus(){

        Random random = new Random(898);

        double noiseStatus = random.nextDouble();

        return noiseStatus;

    }


    public static List<OriginalDto> c_OriginalDto(){

        List<OriginalDto> data = new ArrayList<>();

        for (int i = 0; i < 15; i++) {

            data.add(new OriginalDto(c_id(),c_regionId(),c_LocalDateTime(),c_noiseValue(),c_noiseStatus()));
        }

        return data;
    }



}
