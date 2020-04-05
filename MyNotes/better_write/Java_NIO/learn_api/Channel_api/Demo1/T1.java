package better_write.Java_NIO.learn_api.Channel_api.Demo1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/4
 * \* Time: 10:23
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        try (DBaction dBaction = new DBaction()) {

            System.out.println("使用db进行数据库连接");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static class DBaction implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("关闭连接");
        }
    }
}
