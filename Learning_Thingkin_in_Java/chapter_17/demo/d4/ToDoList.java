package chapter_17.demo.d4;

import java.util.PriorityQueue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 22:17
 * \* Description:
 * \
 */
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {

    static class ToDoItem extends ToDoList implements Comparable<ToDoItem>{

        private char primary;

        private int secondary;

        private String item;

        public ToDoItem(char primary, int secondary, String item) {
            this.primary = primary;
            this.secondary = secondary;
            this.item = item;
        }

        @Override
        public int compareTo(ToDoItem o) {
            if (primary > o.primary){
                return +1;
            }
            if (primary == o.primary){
                if (secondary>o.secondary){
                    return +1;
                } else if (secondary==o.secondary){
                    return 0;
                }
            }
            return -1;
        }

        @Override
        public String toString() {
            return "ToDoItem{" +
                    "primary=" + primary +
                    ", secondary=" + secondary +
                    ", item='" + item + '\'' +
                    '}';
        }
    }

    public void add(String td,char pri,int sec){
        super.add(new ToDoItem(pri,sec,td));
    }

    public static void main(String[] args) {

        ToDoList toDoItems = new ToDoList();

        toDoItems.add("ass",'s',44);

        while (!toDoItems.isEmpty()){
            System.out.println(toDoItems.remove());
        }

    }


}
