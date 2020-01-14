package C_1.c_1_4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 17:06
 * \* Description:
 * \
 */

class Father {
    public String name;
    public Father(){
        this.name = "father";
    }
    public void show(){
        System.out.println("father's name : " + this.name);
    }
}



public class Son extends Father {

//    这里的son只能调用Father的方法（重写或者继承的方法），而不能调用本身定义的一些方法（自己编写的父类中没有的方法）。例如下面这样就会报错。

    public String name;
    public Son(){
        this.name = "son";
    }
    public void show(){
        System.out.println("Son's name: " + this.name);
    }
    public void show2(){
        System.out.println("show2");
    }
    public static void main(String[] args) {
        Father son = new Son();
//        son.show2();//此处就会报错
    }
}
