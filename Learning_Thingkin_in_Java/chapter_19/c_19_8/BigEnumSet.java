package chapter_19.c_19_8;

import java.util.EnumSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 15:29
 * \* Description:
 * \
 */
public class BigEnumSet {

//    EnumSet的基础是long，一个long值有64位  而一个enum实例只需要一位 bit 表示其是否存在

//    也就是 在不超过一个long的表达能力的情况下  EnumSets可以应用于最多不超过64个元素的enum

//    所以如果元素超过了64个会发生啥？

    enum Big { A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10,
        A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21,
        A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32,
        A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43,
        A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54,
        A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, A65,
        A66, A67, A68, A69, A70, A71, A72, A73, A74, A75 }


    public static void main(String[] args) {
        EnumSet<Big> bigEnumSet = EnumSet.allOf(Big.class);
        System.out.println(bigEnumSet);
    }
}
