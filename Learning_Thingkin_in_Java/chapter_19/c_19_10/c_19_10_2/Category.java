package chapter_19.c_19_10.c_19_10_2;

import java.util.EnumMap;

import static chapter_19.c_19_10.c_19_10_2.Input.*;

public enum Category {

    MONEY(NICKEL, DIME, QUARTER, DOLLAR),
    ITEM_SELECTION(TOOTHPASTE, CHIPS, SODA, SOAP),
    QUIT_TRANSACTION(ABORT_TRANSACTION),
    SHUT_DOWN(STOP);


    private Input[] values;

    Category(Input... types) { values = types; }

    private static EnumMap<Input,Category> categories =
            new EnumMap<Input,Category>(Input.class);

    static {
        for(Category c : Category.class.getEnumConstants())
            for(Input type : c.values)
                categories.put(type, c);
    }

    public static Category categorize(Input input) {
        return categories.get(input);
    }
}