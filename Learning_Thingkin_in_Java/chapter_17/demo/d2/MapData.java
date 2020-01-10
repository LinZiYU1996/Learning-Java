package chapter_17.demo.d2;

import chapter_15.c_15_3.Generator;

import java.util.LinkedHashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 9:54
 * \* Description:
 * \
 */
public class MapData<K,V> extends LinkedHashMap<K,V> {

    public MapData(Generator<Pair<K,V>> generator,int quantity){

        for (int i = 0; i < quantity; i++) {
            Pair<K,V> p = generator.next();
            put(p.key,p.value);
        }
    }

    public MapData(Generator<K> kGenerator,Generator<V> vGenerator,int quantity){
        for (int i = 0; i < quantity; i++) {
            put(kGenerator.next(),vGenerator.next());
        }
    }

    public MapData(Generator<K> kGenerator,V v,int quantity){
        for (int i = 0; i < quantity; i++) {
            put(kGenerator.next(),v);
        }
    }


    // An Iterable and a value Generator:
    public MapData(Iterable<K> genK, Generator<V> genV) {
        for(K key : genK) {
            put(key, genV.next());
        }
    }
    // An Iterable and a single value:
    public MapData(Iterable<K> genK, V value) {
        for(K key : genK) {
            put(key, value);
        }
    }
    // Generic convenience methods:
    public static <K,V> MapData<K,V>
    map(Generator<Pair<K,V>> gen, int quantity) {

        return new MapData<K,V>(gen, quantity);

    }


    public static <K,V> MapData<K,V>
    map(Generator<K> genK, Generator<V> genV, int quantity) {

        return new MapData<K,V>(genK, genV, quantity);

    }


    public static <K,V> MapData<K,V>
    map(Generator<K> genK, V value, int quantity) {

        return new MapData<K,V>(genK, value, quantity);
    }

    public static <K,V> MapData<K,V>
    map(Iterable<K> genK, Generator<V> genV) {

        return new MapData<K,V>(genK, genV);

    }


    public static <K,V> MapData<K,V>
    map(Iterable<K> genK, V value) {

        return new MapData<K,V>(genK, value);

    }



}
