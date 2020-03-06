package Effective.P11;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/6
 * \* Time: 20:11
 * \* Description:
 * \
 */
public class PhoneNumber {


    private final short areaCode;

    private final short prefix;

    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof PhoneNumber))
            return false;
        //必须满足如下条件，才能说明为同一个对象
        PhoneNumber pn = (PhoneNumber) obj;
        return pn.areaCode == areaCode && pn.prefix == prefix && pn.lineNumber == lineNumber;
    }


    public static void main(String[] args) {

        Map<PhoneNumber,String> map = new HashMap<>();

        PhoneNumber p1 = new PhoneNumber(1,1,1);

        PhoneNumber p2 = new PhoneNumber(1,1,1);

        map.put(p1,"J");

        //比较对象p1和p2
        System.out.println("p1.equals(p2): " + p1.equals(p2));

        System.out.println("---------------------------------------");
        System.out.println("p2.equals(p1): " + p2.equals(p1));

        System.out.println("----------------------------------------");

        //从hashmap中去获取对象p1和p2

        /*
        前两个结果说明p1和p2为同一对象，但我们发现以p1作为key时，是可以获取到对应的value，而以p2作为key时，却获取到null。

        实际上，是因为PhoneNumber类没有覆盖hashcode方法，从而导致两个相等的实例具有不相等的散列码。

         */
        System.out.println("get p1 from hashmap: " + map.get(p1));
        System.out.println("---------------------------------------");
        System.out.println("get p2 from hashmap: " + map.get(p2));

        System.out.println("---------------------------------------");


        System.out.println(p1.hashCode());

        System.out.println("---------------------------------------");


        System.out.println(p2.hashCode());

        /*
        因此，导致put方法时把电话存放在一个散列桶中，而get方法却在另个散列桶中查找这个电话号码。即使这两个实例正好放到同一个散列桶中（发生“冲突”的情况），get方法也必定会返回null，因为hashmap有一项优化，可以将与每个相关联的散列码缓存起来，如果散列码不匹配，那么将会返回null。

         */


        //实际上，问题很简单，只要我们重写hashcode方法，返回一个适当的hash code即可


        /*
        @Override
        public int hashCode() {
            return 42;
        }
         */

        /*
        这样的确能解决上面的问题，但实际上，这么做，会导致很差的性能，因为它总是确保每个对象都具有同样的散列码。因此，每个对象都被映射到同一个散列桶中，使得散列表退化成链表。

        ** 一个好的散列函数通常倾向于“为不相等的对象产生不同的散列码”**。
        理想情况下，散列函数应该把集合中不相等的实例均匀地分布到所有可能的散列值上。但实际上，要达到这种理想的情形是非常困难的。

         */


        /*
        如何设置一个好的散列函数？
a. 为对象计算int类型的散列码c:

对于boolean类型，计算(f?1:0)
对于byte,char,short,int类型，则计算(int)f
对于long类型，计算(int)(f^(f>>>32))
对于float类型，计算Float.floatToIntBits(f)
对于Double类型，计算Double.doubleToLongBits(f)，然后再按照long类型处理
对于对象引用，并且该类的equals方法通过递归地调用equals的方式来比较这个域，则同样为这个域递归地调用hashcode
对于数组，则把每一个元素当作单独的域来处理。
b. 将获取到的c合并：result = 31 * reuslt + c;

c. 返回result


         */










    }

}
