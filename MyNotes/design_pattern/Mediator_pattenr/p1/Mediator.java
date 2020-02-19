package design_pattern.Mediator_pattenr.p1;

public interface Mediator {

//    抽象调停者类



    /**
     * 同事对象在自身改变的时候来通知调停者方法
     * 让调停者去负责相应的与其他同事对象的交互
     * @param c
     */
     void changed(Colleague c);


}
