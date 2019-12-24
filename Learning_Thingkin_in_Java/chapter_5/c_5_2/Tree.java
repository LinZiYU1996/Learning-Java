package chapter_5.c_5_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:09 2019/12/24
 */
public class Tree {

    int height;

    Tree(){
        System.out.println("播种");
        height = 0;
    }

    Tree(int i){
        System.out.println("种新的树，树高" + i);
        height = i;
    }

    void info() {
        prt("Tree is " + height
                + " feet tall");
    }
    void info(String s) {
        prt(s + ": Tree is "
                + height + " feet tall");
    }
    static void prt(String s) {
        System.out.println(s);
    }


}
