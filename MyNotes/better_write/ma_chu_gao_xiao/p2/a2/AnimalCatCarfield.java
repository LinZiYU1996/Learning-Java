package better_write.ma_chu_gao_xiao.p2.a2;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 21:57
 * \* Description:
 * \
 */
public class AnimalCatCarfield {

    public static void main(String[] args) {


        List<Animal> animal = new ArrayList<>();

        List<Cat> cat = new ArrayList<>();

        List<Garfield> garfield = new ArrayList<>();

        animal.add(new Animal());

        cat.add(new Cat());

        garfield.add(new Garfield());

        // 编译错误    只能赋值 Cat 或者  Cat 子类的集合
//        List<? extends Cat> exCat = animal;

        List<? super Cat> superCat = animal;

        List<? extends Cat> exCatFCat = cat;

        List<? super Cat> superCatFCat = cat;

        List<? extends Cat> exCatFG = garfield;

        //  编译错误        只能赋值  cat 或者 cat父类的集合
//        List<? super Cat> superCatFG = garfield;

        //下面三行都编译出错

//        exCatFCat.add(new Animal());
//
//        exCatFCat.add(new Cat());
//
//        exCatFCat.add(new Garfield());

        System.out.println("------------------");

        // 编译出错  只能添加 cat 或者 cat子类集合
//        superCatFCat.add(new Animal());

        superCatFCat.add(new Cat());

        superCatFCat.add(new Garfield());

        Object o1 = exCatFCat.get(0);

        Cat cat1 = exCatFCat.get(0);


        // 编译出错   类型擦除
//        Garfield garfield1 = exCatFG.get(0);




    }
}
