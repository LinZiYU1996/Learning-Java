package chapter_5.c_5_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:57 2019/12/24
 */
public class SimpleConstructor {

    /**
     *现在，一旦创建一个对象：
     * new Rock();
     * 就会分配相应的存储空间，并调用构建器。这样可保证在我们经手之前，对象得到正确的初始化。
     * 请注意所有方法首字母小写的编码规则并不适用于构建器。这是由于构建器的名字必须与类名完全相同！
     *
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Rock(i);
    }
}
