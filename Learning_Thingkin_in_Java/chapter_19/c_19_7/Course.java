package chapter_19.c_19_7;

import chapter_19.c_19_6.Enums;

public enum Course {

//    创建一个 枚举的枚举

    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);


    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }


    public Food randomSelection() {
        return Enums.random(values);
    }

//    每一个Course的实例都将其对应的Class对象作为构造器的参数
//    通过getEnumConstants可以获取某个Food子类的所有enum实例
//

}
