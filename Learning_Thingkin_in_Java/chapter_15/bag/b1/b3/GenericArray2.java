package chapter_15.bag.b1.b3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:58
 * \* Description:
 * \
 */
public class GenericArray2<T> {

    private Object[] array;

    public GenericArray2(int size){
        array = new Object[size];
    }

    public void put(int index,T item){
        array[index] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T) array[index];
    }

    @SuppressWarnings("unchecked")
    public T[] rep(){
        return (T[]) array;
    }

    public static void main(String[] args) {

        GenericArray2<Integer> genericArray2 =
                new GenericArray2<>(20);

        for (int i = 0; i < 20; i++) {
            genericArray2.put(i,i);

        }

        for (int i = 0; i < 20 ; i++) {
            System.out.println(genericArray2.get(i) + "\n");

        }

//        error
//        Integer[] integers = genericArray2.rep();

    }





}
