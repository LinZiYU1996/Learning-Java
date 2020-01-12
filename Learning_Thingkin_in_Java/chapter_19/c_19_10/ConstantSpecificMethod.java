package chapter_19.c_19_10;

import java.text.DateFormat;
import java.util.Date;

public enum ConstantSpecificMethod {


//    Java的enum有一个有趣的特性  允许你为enum实例编写方法  从而为每个enum实例赋予不同的行为

//    要实现的话，你需要为enum定义一个或多个abstract方法 然后为每个enum实例实现该抽象方法


    DATE_TIME {
        String getInfo() {
            return
                    DateFormat.getDateInstance().format(new Date());
        }
    },


    CLASSPATH {
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },


    VERSION {
        String getInfo() {
            return System.getProperty("java.version");
        }
    };


    abstract String getInfo();


    public static void main(String[] args) {
        for(ConstantSpecificMethod csm : values())
            System.out.println(csm.getInfo());
    }
}
