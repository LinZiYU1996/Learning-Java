package book_jvm.P3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 16:35
 * \* Description:
 * \
 */
public class FInalizeEscapeGC {


    /*
    1 对象可以在被GC之前自我拯救
    2 这种自救机会只有一次
     */

    public static FInalizeEscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("yes i am alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize exe");
        FInalizeEscapeGC.SAVE_HOOK = this;
    }


    public static void main(String[] args) throws InterruptedException {

        SAVE_HOOK = new FInalizeEscapeGC();

        SAVE_HOOK = null;

        System.gc();


        Thread.sleep(500);

        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no i am dead");
        }


        SAVE_HOOK = null;

        System.gc();

        Thread.sleep(500);

        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println(" no i am dead");
        }




    }
}
