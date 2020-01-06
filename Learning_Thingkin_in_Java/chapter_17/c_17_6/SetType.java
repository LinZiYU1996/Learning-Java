package chapter_17.c_17_6;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:51 2020/1/6
 */
public class SetType {


    int i;
    public SetType(int n) { i = n; }
    public boolean equals(Object o) {
        return o instanceof SetType && (i == ((SetType)o).i);
    }
    public String toString() { return Integer.toString(i); }
}
