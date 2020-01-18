package thread.c3.c_3_1.c_3_1_3.a2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 11:20
 * \* Description:
 * \
 */
public class SelfPrivateNum {

    private int num = 0;
    public void add(String name){
        try {
            if (name.equals("a")){


                num = 100;
                System.out.println("a set over");
                Thread.sleep(3000);
            } else {


                num = 200;
                System.out.println("b set over");
            }
            System.out.println(name + "  " +num);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
