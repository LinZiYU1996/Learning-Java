package chapter_17.demo.d5;

import javax.swing.*;
import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 15:32
 * \* Description:
 * \
 */
public class AssociativeArray<K,V> {

    private Object[][] pairs;

    private int index;

    public AssociativeArray(int len) {
        pairs = new Object[len][2];
    }

    public void put(K key,V val){

        if (index >= pairs.length){
            throw new ArrayIndexOutOfBoundsException();
        }

        pairs[index++] = new Object[]{key,val};
    }

    public V get(K k){
        for (int i = 0; i < index; i++) {
            if (k.equals(pairs[i][0])){
                return (V) pairs[i][1];
            }
        }
        return null;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < index; i++) {

            builder.append(pairs[i][0].toString());

            builder.append(":");

            builder.append(pairs[i][1].toString());

            if (i < index-1){
                builder.append("\n");
            }
        }

        return builder.toString();
    }


    public static void main(String[] args) {

//        限定大小为6个  有可能不小心出现数组越界错误
        AssociativeArray<String,String> map =
                new AssociativeArray<>(6);


        map.put("sky","blue");

        map.put("grass","green");

        map.put("tree","tall");

        map.put("extar","object");

        System.out.println(map);

        System.out.println(map.get("sky"));


    }
}
