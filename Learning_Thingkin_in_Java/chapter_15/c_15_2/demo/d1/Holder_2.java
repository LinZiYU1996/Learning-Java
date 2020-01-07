package chapter_15.c_15_2.demo.d1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:08 2020/1/7
 */
public class Holder_2 {

    private Object object;

    public Holder_2(Object object) {
        this.object = object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public static void main(String[] args) {

        Holder_2 holder_2 = new Holder_2(new Apple());

//        需要转型为Apple
        Apple a1 = (Apple) holder_2.getObject();

        holder_2.setObject("String");

//        同上
        String s = (String) holder_2.getObject();

        System.out.println(s);
//Holder_2可以存储任何对象
    }
}
