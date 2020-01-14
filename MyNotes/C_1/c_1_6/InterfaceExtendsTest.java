package C_1.c_1_6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 22:14
 * \* Description:
 * \
 */
interface InterfaceA
{
    int PROP_A = 5;
    void testA();
}
interface InterfaceB
{
    int PROP_B = 6;
    void testB();
}
interface InterfaceC extends InterfaceA, InterfaceB
{
    int PROP_C = 7;
    void testC();
}
public class InterfaceExtendsTest
{
    public static void main(String[] args)
    {
        System.out.println(InterfaceC.PROP_A);
        System.out.println(InterfaceC.PROP_B);
        System.out.println(InterfaceC.PROP_C);
    }
}
