package chapter_13.c_13_5.c_13_5_6;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:15 2020/1/4
 */
public class DatabaseException extends Exception{

    public DatabaseException(int transactionID, int queryID,
                             String message) {
        super(String.format("(t%d, q%d) %s", transactionID,
                queryID, message));
    }
    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write failed");
        } catch(Exception e) {
            System.out.println(e);
        }
    }


}
