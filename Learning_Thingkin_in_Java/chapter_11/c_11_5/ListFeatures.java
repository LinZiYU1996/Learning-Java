package chapter_11.c_11_5;

import chapter_11.c_11_5.model.*;

import java.util.*;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:50 2020/1/2
 */
public class ListFeatures {

    public static void main(String[] args) {


        Random rand = new Random(47);

        List<Pet> pets = Pets.arrayList(7);

        print("1: " + pets);

        Hamster h = new Hamster();

        pets.add(h); // Automatically resizes

        print("2: " + pets);

        print("3: " + pets.contains(h));

        pets.remove(h); // Remove by object

        Pet p = pets.get(2);

        print("4: " + p + " " + pets.indexOf(p));

        Pet cymric = new Cymric();

        print("5: " + pets.indexOf(cymric));

        print("6: " + pets.remove(cymric));

// Must be the exact object:
        print("7: " + pets.remove(p));

        print("8: " + pets);

        pets.add(3, new Mouse()); // Insert at an index

        print("9: " + pets);

        List<Pet> sub = pets.subList(1, 4);

        print("subList: " + sub);

        print("10: " + pets.containsAll(sub));

//        Collections.sort(sub); // In-place sort

        print("sorted subList: " + sub);

// Order is not important in containsAll():

        print("11: " + pets.containsAll(sub));

        Collections.shuffle(sub, rand); // Mix it u
        // p

        print("shuffled subList: " + sub);

        print("12: " + pets.containsAll(sub));

        List<Pet> copy = new ArrayList<Pet>(pets);

        sub = Arrays.asList(pets.get(1), pets.get(4));

        print("sub: " + sub);

        copy.retainAll(sub);

        print("13: " + copy);

        copy = new ArrayList<Pet>(pets); // Get a fresh copy

        copy.remove(2); // Remove by index

        print("14: " + copy);

        copy.removeAll(sub); // Only removes exact objects

        print("15: " + copy);

        copy.set(1, new Mouse()); // Replace an element

        print("16: " + copy);

        copy.addAll(2, sub); // Insert a list in the middle

        print("17: " + copy);

        print("18: " + pets.isEmpty());

        pets.clear(); // Remove all elements

        print("19: " + pets);

        print("20: " + pets.isEmpty());

        pets.addAll(Pets.arrayList(4));

        print("21: " + pets);

        Object[] o = pets.toArray();

        print("22: " + o[3]);

        Pet[] pa = pets.toArray(new Pet[0]);

//        print("23: " + pa[3].id());

    }

//    第一行输出展示了最初的由Pet构成的List，与数组不同，List允许在它被创建之后添加元素，
//    移除元素，或者自我调整尺寸，
//    第二行，可以看到添加了一个Hamster
//    用contains方法来确定某个对象是否在列表中
//    subList允许从较大的列表中创建出一个片断
//    retainAll方法有效的交集操作
}
