package chapter_19.c_19_11;

import com.sun.org.apache.regexp.internal.RE;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 19:48
 * \* Description:
 * \
 */
public class Paper implements Item{

//    对应剪刀石头布 中的 布
    @Override
    public Outcome compete(Item item) {
        return item.eval(this);
    }

//    一样肯定平局
    @Override
    public Outcome eval(Paper paper) {
        return Outcome.DRAW;
    }


//
    @Override
    public Outcome eval(Scissors scissors) {
        return Outcome.WIN;
    }

    @Override
    public Outcome eval(Rock rock) {
        return Outcome.LOSE;
    }

    @Override
    public String toString() {
        return "Paper{}";
    }
}
