package chapter_14.c_14_2.c_14_2_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:03 2020/1/4
 */
public class ClassCasts {

    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House)b; // ... or just do this.
    }


}
