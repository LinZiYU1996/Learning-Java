package Effective.P11;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/6
 * \* Time: 20:28
 * \* Description:
 * \
 */
public class Perfect_PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public Perfect_PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }
    //覆盖equals方法
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Perfect_PhoneNumber))
            return false;
        //必须满足如下条件，才能说明为同一个对象
        Perfect_PhoneNumber pn = (Perfect_PhoneNumber) obj;
        return pn.areaCode == areaCode && pn.prefix == prefix && pn.lineNumber == lineNumber;
    }

    /*
        标准的写法

     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }

    public static void main(String[] args){
        Map<Perfect_PhoneNumber, String> m = new HashMap<>();
        //创建两个相同的对象
        Perfect_PhoneNumber p1 = new Perfect_PhoneNumber(707, 867, 5309);
        Perfect_PhoneNumber p2 = new Perfect_PhoneNumber(707, 867, 5309);
        //添加到hashmap中
        m.put(p1, "Jenny");
        //比较对象p1和p2
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p2.equals(p1): " + p2.equals(p1));
        //从hashmap中去获取对象p1和p2
        System.out.println("get p1 from hashmap: " + m.get(p1));
        System.out.println("get p2 from hashmap: " + m.get(p2));
    }

}
