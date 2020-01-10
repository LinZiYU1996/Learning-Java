package chapter_17.demo.d2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 9:53
 * \* Description:
 * \
 */
public class Pair<K,V> {

    public final K key;

    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
