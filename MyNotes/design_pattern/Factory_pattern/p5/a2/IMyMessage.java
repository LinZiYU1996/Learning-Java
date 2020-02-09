package design_pattern.Factory_pattern.p5.a2;

import java.util.Map;

public interface IMyMessage {
/*
工厂方法模式_产品接口
 */

    public Map<String, Object> getMessageParam();

    public void setMessageParam(Map<String, Object> messageParam);

    public void sendMesage() throws Exception;// 发送通知/消息
}
