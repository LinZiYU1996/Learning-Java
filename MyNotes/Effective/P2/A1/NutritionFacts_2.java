package Effective.P2.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/28
 * \* Time: 20:36
 * \* Description:
 * \
 */
public class NutritionFacts_2 {

    private final int servingSize;

    private final int servings;

    private final int calories;

    private final int fat;

    private final int sodium;

    private final int carbohydrate;

    public static class Builder {

        private final int servingSize;

        private final int servings;

        private int calories = 0;

        private int fat = 0;

        private int sodium = 0;

        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val){
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts_2 build() {
            return new NutritionFacts_2(this);
        }

    }


    private NutritionFacts_2(Builder builder) {

        servingSize = builder.servingSize;

        servings = builder.servings;

        calories = builder.calories;

        fat = builder.fat;

        sodium = builder.sodium;

        carbohydrate = builder.carbohydrate;
    }


    @Override
    public String toString() {
        return "NutritionFacts_2{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
