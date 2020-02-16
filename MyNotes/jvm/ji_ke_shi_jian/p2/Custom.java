package jvm.ji_ke_shi_jian.p2;

public interface Custom {



    //具体来说，Java 字节码中与调用相关的指令共有五种。
    //1. invokestatic：用于调用静态方法。
    //2. invokespecial：用于调用私有实例方法、构造器，以及使用 super 关键字调用父类的实例方法
    //或构造器，和所实现接口的默认方法。
    //3. invokevirtual：用于调用非私有实例方法。
    //4. invokeinterface：用于调用接口方法。
    //5. invokedynamic：用于调用动态方法。


    boolean isVIP();
}
