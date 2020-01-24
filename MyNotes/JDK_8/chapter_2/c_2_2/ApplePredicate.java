package JDK_8.chapter_2.c_2_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

public interface ApplePredicate {


//    一种可能的解决方案是对你的选择标准建模：你考虑的
//是苹果，需要根据 Apple 的某些属性（比如它是绿色的吗？重量超过150克吗？）来返回一个
//boolean 值。我们把它称为谓词（即一个返回 boolean 值的函数）。让我们定义一个接口来对选
//择标准建模：


    boolean test (Apple apple);


}
