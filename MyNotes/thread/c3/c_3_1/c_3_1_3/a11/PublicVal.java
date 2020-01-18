package thread.c3.c_3_1.c_3_1_3.a11;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 18:26
 * \* Description:
 * \
 */
public class PublicVal {

    public String username = "A";

    public String password = "AA";

    synchronized public void setVal(String username,String password){

        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("set thread name   " +
                    Thread.currentThread().getName()
            +"   username   " + username
            + "   password   "+password);


        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public void getVal(){
        System.out.println("get thread name   " +
                Thread.currentThread().getName()
                +"   username   " + username
                + "   password   "+password);
    }

}
