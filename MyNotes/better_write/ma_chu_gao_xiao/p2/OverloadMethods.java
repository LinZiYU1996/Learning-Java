package better_write.ma_chu_gao_xiao.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 16:19
 * \* Description:
 * \
 */
public class OverloadMethods {

    /*
    无参
     */

    public void overloadMethod(){
        System.out.println("无参数方法");
    }

    /*
    基本数据类型
     */

    public void m1(int param){
        System.out.println("参数为int的方法");
    }

    /*
    包装数据类型
     */

    public void m1(Integer param){
        System.out.println("    包装数据类型方法");
    }

    /*
    可变参数
     */

    public void m1(Integer...param){
        System.out.println("可变参数");
    }

    /*
    object 对象
     */

    public void m1(Object param){
        System.out.println("Object 参数方法");
    }


    public static void main(String[] args) {
        OverloadMethods overloadMethods = new OverloadMethods();

        overloadMethods.m1(7);

        //参数为int的方法

        /*
        精确匹配优先
        int 胜出  因为不用自动装箱
         */
    }

}
