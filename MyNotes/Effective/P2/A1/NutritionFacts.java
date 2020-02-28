package Effective.P2.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/28
 * \* Time: 20:27
 * \* Description:
 * \
 */
public class NutritionFacts {

    // 重叠变量构造器模式


    private final int servingSize;

    private final int servings;

    private final int calories;

    private final int fat;

    private final int sodium;

    private final int carbohydrate;

    public NutritionFacts(int servingSize,int servings){
        this(servingSize,servings,0);
    }

    public NutritionFacts(int servingSize,int servings,int calories){
        this(servingSize,servings,calories,0);
    }

    public NutritionFacts(int servingSize,int servings,int calories,int fat){
        this(servingSize,servings,calories,fat,0);
    }

    public NutritionFacts(int servingSize,int servings,int calories,int fat,int sodium){
        this(servingSize,servings,calories,fat,sodium,0);
    }

    public NutritionFacts(int servingSize,int servings,
                           int calories,int fat,int sodium,int carbohydrate){
        this.servingSize=servingSize;
        this.servings=servings;
        this.calories=calories;
        this.fat=fat;
        this.sodium=sodium;
        this.carbohydrate=carbohydrate;
    }


    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
