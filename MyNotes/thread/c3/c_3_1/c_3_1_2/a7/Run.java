package thread.c3.c_3_1.c_3_1_2.a7;

import thread.c3.c_3_1.c_3_1_2.Data;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 10:37
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {

        DBTools dbTools = new DBTools();

        for (int i = 0; i < 20; i++) {

            BackupB b = new BackupB(dbTools);

            b.start();

            BackupA a = new BackupA(dbTools);

            a.start();

        }

    }
}
