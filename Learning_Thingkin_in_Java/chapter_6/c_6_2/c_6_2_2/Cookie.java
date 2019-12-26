package chapter_6.c_6_2.c_6_2_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:15 2019/12/26
 */

//当您使用public关键字时，它表示成员声明立即 公开对所有人开放，尤其是使用 图书馆。 假设您定义了一个包含以下编译单元的包装甜点：
public class Cookie {

    public Cookie() {
        System.out.println("Cookie constructor");
    }
    void bite() { System.out.println("bite"); }


}
