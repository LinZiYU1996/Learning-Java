package Effective.P2.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/28
 * \* Time: 20:41
 * \* Description:
 * \
 */
public class Main2 {

    public static void main(String[] args) {


        NutritionFacts_2 facts_2 = new NutritionFacts_2.Builder(100,100)
                .calories(100).sodium(100)
                .carbohydrate(100).build();


        System.out.println(facts_2);



    }
}
