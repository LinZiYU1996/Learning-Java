package better_write.Learn_reflection.A3;



import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/21
 * \* Time: 20:24
 * \* Description:
 * \
 */
public class MethodInvoke {

    public static void main(String[] args) throws Exception {
        Method animalMethod = Animal.class.getDeclaredMethod("print");
        Method catMethod = Cat.class.getDeclaredMethod("print");

        Animal animal = new Animal();
        Cat cat = new Cat();
        animalMethod.invoke(cat);
        animalMethod.invoke(animal);

        catMethod.invoke(cat);
        catMethod.invoke(animal);
    }
/*
Cat.print()
Animal.print()
Cat.print()
Exception in thread "main" java.lang.IllegalArgumentException: object is not an instance of declaring class
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at better_write.Learn_reflection.A3.MethodInvoke.main(MethodInvoke.java:26)
 */

}

class Animal {

    public void print() {
        System.out.println("Animal.print()");
    }

}

class Cat extends Animal {

    @Override
    public void print() {
        System.out.println("Cat.print()");
    }


}