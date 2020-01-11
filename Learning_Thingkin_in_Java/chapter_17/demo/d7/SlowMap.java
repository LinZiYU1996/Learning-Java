package chapter_17.demo.d7;

import chapter_17.demo.d3.Alphats;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 16:11
 * \* Description:
 * \
 */
//public class SlowMapM<K,V> extends AbstractMap<K,V> {
//
//    private List<K> keys = new ArrayList<>();
//
//    private List<V> vList = new ArrayList<>();
//
//    public V put(K key,V value){
//
//        V oldVal = get(key);
//
//        if ( !keys.contains(key)) {
//            keys.add(key);
//            vList.add(value);
//        } else {
//            vList.set(keys.indexOf(key),value);
//        }
//        return oldVal;
//    }
//
//    public V get(Object key){
//
//
//        if (!keys.contains(key)){
//            return null;
//        }
//        return vList.get(keys.indexOf(key));
//    }
//
//    public Set<Entry<K,V>> entrySet(){
//
//        Set<Entry<K,V>> set = new HashSet<>();
//
//        Iterator<K> kIterator = keys.iterator();
//
//        Iterator<V> vIterator = vList.iterator();
//
//        while (kIterator.hasNext()){
//            set.add(new MapEntry<K,V>(kIterator.next(),vIterator.next()));
//        }
//        return set;
//    }
//
//    public static void main(String[] args) {
//
//        SlowMapM<String,String> m = new SlowMapM<>();
//
////        m.putAll(Alphats.names(5));
//
//    }
//
//
//
//}
