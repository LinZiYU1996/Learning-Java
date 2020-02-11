package design_pattern.Builder_pattern.p3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 11:09
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        Director director = new Director();//创建装机人员


        director.setBuilder(new LowConfigBuilder()); //告诉装机人员电脑配置，这里为低配版


        director.createComputer(); //装机人员开始组装


        Computer computer = director.getComputer(); //从装机人员获取组装好的电脑


        System.out.print("电脑配置：" + computer.toString());  //查看电脑配置

    }
}
