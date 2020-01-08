package chapter_15.bag.b1.b2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:50
 * \* Description:
 * \
 */
//泛型数组包装器
public class GenericArray<T> {

    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int sz){
        array = (T[]) new Object[sz];
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

        GenericArray<Integer> gai =
                new GenericArray<>(10);


//        error
//        Integer[] integers = gai.rep();

        Object[] objects = gai.rep();

    }

}
