package chapter_19.c_19_2;

import static chapter_6.c_6_1.c_6_1_3.Print.print;


public enum OzWitch {

//    枚举类实例能够返回对自身的描述，可以提供一个构造器，专门负责处理这个额外的信息
//    然后添加一个方法，返回这个描述信息

//    如果打算添加自己的方法，要在enum实例序列最后添加一个分号
//    同时你要先定义enum实例，再定义任何方法或者属性




    // Instances must be defined first, before methods:

    WEST("Miss Gulch, aka the Wicked Witch of the West"),

    NORTH("Glinda, the Good Witch of the North"),

    EAST("Wicked Witch of the East, wearer of the Ruby " +
            "Slippers, crushed by Dorothy’s house"),

    SOUTH("Good by inference, but missing");


    private String description;

    // Constructor must be package or private access:
    private OzWitch(String description) {
        this.description = description;
    }
    public String getDescription() { return description; }
    public static void main(String[] args) {
        for(OzWitch witch : OzWitch.values())
            print(witch + ": " + witch.getDescription());
    }


}
