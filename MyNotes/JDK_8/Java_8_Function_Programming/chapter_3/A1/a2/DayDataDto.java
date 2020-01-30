package JDK_8.Java_8_Function_Programming.chapter_3.A1.a2;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 19:34
 * \* Description:
 * \
 */
public class DayDataDto {

    private String id;

    private LocalDate date;


//    public DayDataDto(String id, LocalDate date) {
//        this.id = id;
//        this.date = date;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
