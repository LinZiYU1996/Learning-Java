package design_pattern.State_pattern.p1;


/*
 * 状态（State）角色：定义一个接口以封装与使用环境角色的一个特定状态相关的行为。

 */
public interface State {

    // 执行'上一步' 操作
     void lastStep(Context ctx);

    // 执行'下一步' 操作
     void nextStep(Context ctx);

}
