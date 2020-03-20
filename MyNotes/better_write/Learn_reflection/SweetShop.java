package better_write.Learn_reflection;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/19
 * \* Time: 20:48
 * \* Description:
 * \
 */
public class SweetShop {

    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try {
            Class.forName("better_write.Learn_reflection.Gum");
        } catch(ClassNotFoundException e) {
            print("Couldn't find Gum");
        }
        print("After Class.forName(\"better_write.Learn_reflection.Gum\")");
        new Cookie();
        print("After creating Cookie");
    }

}

class Candy {
    static {   System.out.println("Loading Candy"); }
}

class Gum {
    static {   System.out.println("Loading Gum"); }
}

class Cookie {
    static {   System.out.println("Loading Cookie"); }
}

/*
inside main
Loading Candy
After creating Candy
Loading Gum
After Class.forName("better_write.Learn_reflection.Gum")
Loading Cookie
After creating Cookie
 */