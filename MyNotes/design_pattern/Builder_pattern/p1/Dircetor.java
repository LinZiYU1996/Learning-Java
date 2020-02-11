package design_pattern.Builder_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 10:33
 * \* Description:
 * \
 */
public class Dircetor {

    private Builder builder;

    public Dircetor(Builder builder) {
        this.builder = builder;
    }

    public void construct(){

        builder.makeTitle("Greeting");

        builder.makeString("从早到晚");

        builder.makeItems(new String[]{"早上好","下午好"});

        builder.makeString("晚上");

        builder.makeItems(new String[]{
                "晚上好",
                "晚安",
                "再见"
        });

        builder.close();
    }
}
