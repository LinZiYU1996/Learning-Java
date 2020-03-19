package Effective.P18.A1;

import java.util.Collection;
import java.util.Set;
import java.util.Spliterator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/14
 * \* Time: 21:26
 * \* Description:
 * \
 */
public class InstrumentedHashSet<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public InstrumentedHashSet(Set<E> s) {
        super(s);
    }
    @Override
    public Spliterator<E> spliterator() {
        return null;
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