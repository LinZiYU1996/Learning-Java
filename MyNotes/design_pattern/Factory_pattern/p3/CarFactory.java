package design_pattern.Factory_pattern.p3;

public interface CarFactory {


    // 二. 工厂方法模式
    //
    // 　　设计一个工厂的接口，你想要什么东西，就写个类继承于这个工厂，这样就不用修改什么，直接添加就行了。就相当于，我这个工厂是用来生汽车的，而要什么品牌的汽车具体分到了每个车间，如果新多了一种品牌的汽车，直接新增一个车间就行了。那么问题又来了，如果想要生产大炮怎么办？


    public Car getCarByFactory();


}
