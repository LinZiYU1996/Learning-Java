package design_pattern.Strategy_pattern.p1;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/15
 * \* Time: 21:27
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        List<ChildClass> list=new ArrayList<>();
        FarClass1 farClass1=new FarClass1();
        FarClass2 farClass2=new FarClass2();
        list.add(farClass1);
        list.add(farClass2);
        for (ChildClass childClass:list){
            childClass.a();
        }



    }
}
