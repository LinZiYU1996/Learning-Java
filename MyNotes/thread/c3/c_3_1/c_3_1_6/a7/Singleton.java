package thread.c3.c_3_1.c_3_1_6.a7;

public enum Singleton {

    INSTANCE;

    private byte[] data = new byte[1024];

    Singleton()
    {
        System.out.println("INSTANCE will be 初始化");
    }

    public static void method(){
//        调用该方法会主动使用Singleton，INSTANCE将被实例化
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
