package Effective.P18;

import java.util.Collection;
import java.util.HashSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/14
 * \* Time: 21:05
 * \* Description:
 * \
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

/*

一个程序使用了 hashset

现在要查询HashSet 看一看自从它被创建以来添加了多少个元素

为了提供这种功能    编写一个HashSet的变体 定义记录试图插入的元素的数量addCount

并针对给计数值导出一个访问方法

Hashs类有两个可以增加元素的方法:

add

addAll

因此这两个方法都要被覆盖


 */
    private int addCount = 0;

    public InstrumentedHashSet() {

    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap,loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
