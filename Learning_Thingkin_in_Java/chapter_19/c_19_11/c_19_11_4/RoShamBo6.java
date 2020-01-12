package chapter_19.c_19_11.c_19_11_4;

import chapter_19.c_19_11.Competitor;
import chapter_19.c_19_11.Outcome;
import chapter_19.c_19_11.RoShamBo;

import static chapter_19.c_19_11.Outcome.*;

public enum RoShamBo6 implements Competitor<RoShamBo6> {

//    用数组实现分发


    PAPER, SCISSORS, ROCK;

    private static Outcome[][] table = {
            { DRAW, LOSE, WIN }, // PAPER
            { WIN, DRAW, LOSE }, // SCISSORS
            { LOSE, WIN, DRAW }, // ROCK
    };


    public Outcome compete(RoShamBo6 other) {
        return table[this.ordinal()][other.ordinal()];
    }


    public static void main(String[] args) {
        RoShamBo.play(RoShamBo6.class, 20);
    }

}
