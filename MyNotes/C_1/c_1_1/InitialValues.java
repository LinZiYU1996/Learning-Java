package C_1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 21:47
 * \* Description:
 * \
 */
public class InitialValues {

    boolean t;
    char c;
    short s;
    int i;
    long l;
    float f;
    double d;
    String str;
    InitialValues reference;

    void printInitialValues() {
        System.out.printf("%-10s %-5s\n", "boolean:", t);
        System.out.printf("%-10s %-5s\n", "char:", c);
        System.out.printf("%-10s %-5s\n", "short:", s);
        System.out.printf("%-10s %-5s\n", "int:", i);
        System.out.printf("%-10s %-5s\n", "long:", l);
        System.out.printf("%-10s %-5s\n", "float:", f);
        System.out.printf("%-10s %-5s\n", "double:", d);
        System.out.printf("%-10s %-5s\n", "String:", str);
        System.out.printf("%-10s %-5s\n", "reference:", reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
    }

}
