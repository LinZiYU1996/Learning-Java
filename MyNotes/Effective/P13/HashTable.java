package Effective.P13;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/8
 * \* Time: 19:36
 * \* Description:
 * \
 */
public class HashTable implements Cloneable{


    /*
    若类中存在一个对象或者集合（自定义对象、List、Map等），那么光调用这些对象的clone还不够，例如编写一个散列表的clone方法，它的内部数据包含一个散列桶数组：
     */
//    private Entry[] buckets = ...
//
//    private static class Entry {
//        final Object key;
//        Object value;
//        Entry next;
//
//        Entry(key, value, next) ...
//    }

    /*
    如果只调用了buckets.clone，其实克隆出来的buckets和被克隆的buckets内的entry是引用着同一对象的。

这种情况下，必须单独拷贝并组成每个桶的链表，例如：

// 伪代码
class HashTable implements Cloneable {
    private Entry[] buckets = ...

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        Entry(key, value, next) ...
    }

    // 提供一个深拷贝函数
    Entry deepCopy() {
        return new Entry(key, value, next == null ? null : next.deepCopy());
    }

    @Override
    public HashTable clone() {
        try ...
        HashTable result = (HashTable) super.clone();
        result.buckets = new Enrty[buckets.length];
        for(int i=0;i<buckets.length;i++) {
            if(buckets[i] != null)
                result.buckets[i] = buckets[i].deepCopy();
        }
        return result;
        catch CloneNotSupportedException e ...
    }

}


     */


}
