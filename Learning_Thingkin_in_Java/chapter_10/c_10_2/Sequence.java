package chapter_10.c_10_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:37 2019/12/29
 */
public class Sequence {

    private Object[] items;

    private int next = 0;

    public Sequence(int size) { items = new Object[size]; }

//    在序列末增加新的Object
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }

//    获取Sequence中的每一个对象
    public Selector selector() {
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }


}
