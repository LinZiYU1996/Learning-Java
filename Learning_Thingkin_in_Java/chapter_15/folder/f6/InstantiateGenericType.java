package chapter_15.folder.f6;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:13 2020/1/7
 */
public class InstantiateGenericType {

    public static void main(String[] args) {

        ClassFactory<Apple> classFactory =
                new ClassFactory<>(Apple.class);

        System.out.println("succeed");


//        报错
        ClassFactory<Integer> classFactory1 =
                new ClassFactory<>(Integer.class);



    }
}
