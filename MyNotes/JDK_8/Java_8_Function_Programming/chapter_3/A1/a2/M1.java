package JDK_8.Java_8_Function_Programming.chapter_3.A1.a2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 19:33
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {


        List<OriginalDto> originalDtoList = DataSource.c_OriginalDto();

        //获取originalDtoList中所有id的集合
        List<String> originalDtoIdList = originalDtoList.stream().map(OriginalDto::getId).collect(Collectors.toList());

        System.out.println(originalDtoIdList);

        System.out.println("===================================================");

        //根据originalDtoList的deviceTime进行分组
        Map<LocalDateTime, List<OriginalDto>> dateTimeListMap= originalDtoList.stream().collect(Collectors.groupingBy(OriginalDto::getDeviceTime));

        System.out.println(dateTimeListMap);
        //求每个deviceTime分组对应的noiseValue的和
        Map<LocalDateTime, Double> doubleMap = originalDtoList.stream().collect(
                Collectors.groupingBy(OriginalDto::getDeviceTime, Collectors.summingDouble(OriginalDto::getNoiseValue)));


        //获取originalDtoList中所有噪音值的平均值,此时mapToDouble转换为Double流，也可以求和，最大值，最小值,去重，排序,计数等
        OptionalDouble avgNoiseOptional = originalDtoList.stream().mapToDouble(OriginalDto::getNoiseValue).average();

        //对originalDtoList中元素按照deviceTime进行排序
        originalDtoList = originalDtoList.stream().sorted(Comparator.comparing(OriginalDto::getDeviceTime)).collect(Collectors.toList());


        //从idList到dayDataDto集合
        List<DayDataDto> dayDataList = originalDtoIdList.stream().map(id -> {
            DayDataDto dayDataDto = new DayDataDto();
            dayDataDto.setId(id);
            dayDataDto.setDate(LocalDate.now());
            return dayDataDto;
        }).collect(Collectors.toList());

        //满足noiseStatus=0的regionId前3个的集合
        List<String> regionId = originalDtoList.stream().filter(originalDto -> originalDto.getNoiseStatus() == 0)
                .map(OriginalDto::getRegionId).limit(3).collect(Collectors.toList());



    }
}
