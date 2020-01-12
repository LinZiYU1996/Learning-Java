package chapter_19.c_19_5;

import chapter_15.c_15_3.Generator;

import java.util.Random;

public enum CartoonCharacter implements Generator<CartoonCharacter> {


    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;

    private Random rand = new Random(47);


    public CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }


}
