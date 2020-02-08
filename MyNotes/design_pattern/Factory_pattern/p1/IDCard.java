package design_pattern.Factory_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/7
 * \* Time: 22:19
 * \* Description:
 * \
 */
public class IDCard extends Product{

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的id卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的id卡");
    }

    public String getOwner() {
        return owner;
    }
}
