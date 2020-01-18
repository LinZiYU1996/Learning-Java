package thread.c3.c_3_1.c_3_1_2.a7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 10:36
 * \* Description:
 * \
 */
public class BackupA extends Thread{

    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }


    @Override
    public void run() {
        dbTools.backupA();
    }
}
