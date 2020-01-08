package chapter_15.bag.b1.b3;

import java.lang.reflect.Array;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:06
 * \* Description:
 * \
 */
public class GenericArrayWithTypeToken<T> {

    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type,int siez){
        array = (T[]) Array.newInstance(type,siez);
    }

    public void put(int index,T item){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }

    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {

        GenericArrayWithTypeToken genericArrayWithTypeToken =
                new GenericArrayWithTypeToken(Integer.class,30);

//        error
//        Integer[] ia = genericArrayWithTypeToken.rep();


    }

}
