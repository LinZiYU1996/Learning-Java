package JDK_8.Java_8_Function_Programming.chapter_3.data.a1;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 17:15
 * \* Description:
 * \
 */
public class Artist {

    private String name;

    private List<String> members;

    private String origin;

    private class Track{
        String name;
    }


    private class Album{
        String name;

        List<Track> tracks;

        List<String> musicians;
    }



}
