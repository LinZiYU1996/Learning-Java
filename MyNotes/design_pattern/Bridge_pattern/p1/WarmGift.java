package design_pattern.Bridge_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/14
 * \* Time: 21:31
 * \* Description:
 * \
 */
public class WarmGift extends Gift{

    public WarmGift(GiftImpl impl) {
        this.impl = impl;
    }
}
