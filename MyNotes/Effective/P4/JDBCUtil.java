package Effective.P4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/1
 * \* Time: 21:22
 * \* Description:
 * \
 */
public class JDBCUtil {

//    //Suppress default constructor for noninstantiability
//    private JDBCUtil() {
//        throw new AssertionError();
//    }
//
//    /**获取连接*/
//    public static Connection getConnection() {
//        Connection conn = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/flowersale";
//            String username = "root";
//            String password = "root";
//            conn = DriverManager.getConnection(url, username, password);
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return conn;
//    }
//    /**
//     * 释放资源
//     * @param rs
//     * @param stmt
//     * @param conn
//     */
//    public static void release(ResultSet rs, Statement stmt, Connection conn) {
//        if(rs!=null) {
//            try {
//                rs.close();
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//        if(stmt!=null) {
//            try {
//                stmt.close();
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//        if(conn!=null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }
//
//    /**
//     * 增删改代码整合
//     */
//    public static int execute(String sql,Object... args) {
//        int result = -1;
//        Connection conn = null;
//        PreparedStatement ps = null;
//        try {
//            conn = JDBCUtil.getConnection();
//            ps = conn.prepareStatement(sql);
//            for(int i=0;i<args.length;i++) {
//                ps.setObject(i+1, args[i]);
//            }
//            result = ps.executeUpdate();
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }finally {
//            JDBCUtil.release(null, ps, conn);
//        }
//        return result;
//    }
}
