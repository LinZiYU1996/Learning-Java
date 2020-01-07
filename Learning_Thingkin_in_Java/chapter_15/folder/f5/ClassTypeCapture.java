package chapter_15.folder.f5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:27 2020/1/7
 */
public class ClassTypeCapture<T> {

    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg){
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {

        ClassTypeCapture<Fruit> classTypeCapture =
                new ClassTypeCapture<>(Fruit.class);


        System.out.println(classTypeCapture.f(new Fruit()));

        System.out.println("____________________________________");

        System.out.println(classTypeCapture.f(new Apple()));

        System.out.println("____________________________________");

        ClassTypeCapture<Apple> classTypeCapture1 =
                new ClassTypeCapture<>(Apple.class);

        System.out.println(classTypeCapture1.f(new Fruit()));

        System.out.println("____________________________________");

        System.out.println(classTypeCapture1.f(new Apple()));


    }
}
