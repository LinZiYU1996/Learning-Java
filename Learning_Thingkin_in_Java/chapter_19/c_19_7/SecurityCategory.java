package chapter_19.c_19_7;

import chapter_19.c_19_6.Enums;

public enum SecurityCategory {


//    更加高效简洁的管理枚举的方法

//    将一个enum 嵌套在另一个enum里面

    STOCK(Security.Stock.class), BOND(Security.Bond.class);

    Security[] values;


    SecurityCategory(Class<? extends Security> kind) {
        values = kind.getEnumConstants();
    }


//    Security接口是将其包含的enum组合成一个公共类型
    interface Security {

        enum Stock implements Security { SHORT, LONG, MARGIN }

        enum Bond implements Security { MUNICIPAL, JUNK }
    }


    public Security randomSelection() {
        return Enums.random(values);
    }


    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            SecurityCategory category =
                    Enums.random(SecurityCategory.class);
            System.out.println(category + ": " +
                    category.randomSelection());
        }
    }


}
