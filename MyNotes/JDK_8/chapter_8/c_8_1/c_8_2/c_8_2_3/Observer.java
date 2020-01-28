package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_3;

public interface Observer {


//    你需要一个观察者接口，它将不同的观察者聚合在一起。它仅有一个名为 notify 的
//方法，一旦接收到一条新的新闻，该方法就会被调用
    void notify(String tweet);


}
