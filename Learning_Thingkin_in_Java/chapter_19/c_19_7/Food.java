package chapter_19.c_19_7;

public interface Food {

//    接口内部 创建实现该接口的枚举 以此将元素分组

//    假设想用enum来表示不同的事物  同时还希望每个enum元素仍然保持food类型

    enum Appetizer implements Food {
        SALAD, SOUP, SPRING_ROLLS;
    }
    enum MainCourse implements Food {
        LASAGNE, BURRITO, PAD_THAI,
        LENTILS, HUMMOUS, VINDALOO;
    }
    enum Dessert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE,
        FRUIT, CREME_CARAMEL;
    }
    enum Coffee implements Food {
        BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
        LATTE, CAPPUCCINO, TEA, HERB_TEA;
    }

//    对于eunum，实现接口是使其子类化的唯一办法
//    所以嵌入在food中的每个enum都实现了food接口


}
