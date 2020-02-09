package design_pattern.Factory_pattern.p5.a2;

public interface IMyMessageFactory {

    /*
     工厂方法模式_工厂接口
     */
    public IMyMessage createMessage(String messageType);

}
