package design_pattern.Bridge_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/14
 * \* Time: 21:33
 * \* Description:
 * \
 */
public class Boy {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void pursue(MM mm) {
        //Gift g = new WarmGift(new Flower());
        Gift g = new WildGift(new Ring());
        //give(g, mm);
    }
    public void give(Gift g, MM mm) {
    }


}
