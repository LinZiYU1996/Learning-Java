package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_filter_and_map_Example;

import java.util.List;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:25
 * \* Description:
 * \
 */
public class MapDemo {

//Stream.map
//Stream.map() creates a stream using source stream applying given function. In the example we have an employee stream and then we converted into player stream using map.


    public static void main(String[] args) {

        List<Employee> list = Employee.getEmpList();

        Stream<Player> playerStream = list.stream()
                .map(employee -> new Player(employee.id,employee.name));

        playerStream.forEach(
                player ->
                        System.out.println(player.id+"   "+player.name)
        );
    }


    static class Player {
        int id;
        String name;
        Player(int id, String name){
            this.id = id;
            this.name = name;
        }
    }


}
